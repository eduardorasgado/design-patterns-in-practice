package behavioral.Mediator.MedievalGameExample;

public interface PartyMember {
	void joinedParty(IParty party);

	void partyAction(Action action);

	void act(Action action);
}
