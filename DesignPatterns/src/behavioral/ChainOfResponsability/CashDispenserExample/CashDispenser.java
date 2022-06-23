package behavioral.ChainOfResponsability.CashDispenserExample;

public class CashDispenser {
	private int denomination;
	private CashDispenser nextDispenser;
	
	public CashDispenser(int denomination) {
		this.denomination = denomination;
	}

	public void setNext(CashDispenser nextDispenser) {
		if(this.nextDispenser != null) {
			this.nextDispenser.setNext(nextDispenser);
		} else {
			this.nextDispenser = nextDispenser ;
		}
	}

	public void dispense(int amount) {
		if(amount >= denomination) {
			int balance = amount % denomination;
			int bills = amount / denomination;
			
			System.out.println(bills + " bills of " + denomination);
			System.out.println("to deliver: " + balance);
			if(balance != 0) {
				nextDispenser.dispense(balance);
			}
		} else {
			nextDispenser.dispense(amount);
		}
	}

}
