package creational.AbstractFactory.KindomExample;

public class KindomFactoryDemo {
	public static void main(String[] args) {
		KingdomApp app = new KingdomApp();
		app.createKingdom(FactoryMaker.getKingdomFactory(KingdomType.ELF));
		System.out.println(app.getArmy().getDescription());
		System.out.println(app.getCastle().getDescription());
		System.out.println(app.getKing().getDescription());
		
		app.createKingdom(FactoryMaker.getKingdomFactory(KingdomType.ELF));
		
		System.out.println(app.getArmy().getDescription());
		System.out.println(app.getCastle().getDescription());
		System.out.println(app.getKing().getDescription());
	}
}
