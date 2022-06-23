package behavioral.ChainOfResponsability.CashDispenserExample;

public class CashDispenserDemo {
	public static void main(String[] args) {
		CashDispenser cDispenser2 = new CashDispenser(2);
		CashDispenser cDispenser5 = new CashDispenser(5);
		CashDispenser cDispenser10 = new CashDispenser(10);
		CashDispenser cDispenser20 = new CashDispenser(20);
		CashDispenser cDispenser50 = new CashDispenser(50);
		CashDispenser cDispenser100 = new CashDispenser(100);
		CashDispenser cDispenser200 = new CashDispenser(200);
		CashDispenser cDispenser500 = new CashDispenser(500);
		CashDispenser cDispenser1000 = new CashDispenser(1000);
		
		cDispenser1000.setNext(cDispenser500);
		cDispenser1000.setNext(cDispenser200);
		cDispenser1000.setNext(cDispenser100);
		cDispenser1000.setNext(cDispenser50);
		cDispenser1000.setNext(cDispenser20);
		cDispenser1000.setNext(cDispenser10);
		cDispenser1000.setNext(cDispenser5);
		cDispenser1000.setNext(cDispenser2);
		
		cDispenser1000.dispense(13577);
	}
}
