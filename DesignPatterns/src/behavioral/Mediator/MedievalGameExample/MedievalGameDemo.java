package behavioral.Mediator.MedievalGameExample;

public class MedievalGameDemo {
	public static void main(String[] args) {
		IParty party = new Party();
		
		PartyMember rogue = new Rogue("Rogue", party);
		PartyMember wizard = new Wizard("Wizard",party);
		PartyMember hunter = new Hunter("Hunter",party);
		PartyMember hobbit = new Hobbit("Hobbit",party);
		
		party.addMember(rogue );
		party.addMember(wizard);
		party.addMember(hunter);
		party.addMember(hobbit);
		
		rogue.act(Action.ENEMY);
		rogue.act(Action.TALE);
		rogue.act(Action.GOLD);
		rogue.act(Action.HUNT);
	}
}
