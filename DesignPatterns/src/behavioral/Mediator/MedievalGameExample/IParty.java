package behavioral.Mediator.MedievalGameExample;

public interface IParty {
	void addMember(PartyMember partyMember);
	void act(PartyMember partyMember, Action action);
}
