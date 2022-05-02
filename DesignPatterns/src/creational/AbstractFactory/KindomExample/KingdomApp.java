package creational.AbstractFactory.KindomExample;

public class KingdomApp {
	private Castle castle;
	
	private King king;

	private Army army;
	
	public KingdomApp() {
	}
	
	public void createKingdom(KingdomFactory kFactory) {
		castle = kFactory.createCastle();
		king = kFactory.createKing();
		army = kFactory.createArmy();
	}
	
	public Castle getCastle() {
		return castle;
	}

	public King getKing() {
		return king;
	}

	public Army getArmy() {
		return army;
	}
}
