package creational.AbstractFactory.KindomExample;

public interface KingdomFactory {
	Castle createCastle();
	
	Army createArmy();
	
	King createKing();
}
