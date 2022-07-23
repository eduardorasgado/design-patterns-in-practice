package behavioral.Mediator.MedievalGameExample;

import java.util.logging.Logger;

public class PartyMemberBase implements PartyMember {
	private static final Logger LOGGER = Logger.getLogger(PartyMemberBase.class.getName());
	
	private String name;
	private IParty party;

	public PartyMemberBase(String name, IParty party) {
		this.name = name;
		this.party = party;
	}

	@Override
	public void joinedParty(IParty party) {
		LOGGER.info(this.getClass().getSimpleName() + " joined the party");
		this.party = party;
	}

	@Override
	public void partyAction(Action action) {		
		LOGGER.info(this.getClass().getSimpleName() + " | " + action.getReaction());
	}

	@Override
	public void act(Action action) {
		if(party != null) {
			LOGGER.info(getName() + " | " + action.getAction());
			party.act(this, action);
		}
	}

	public String getName() {
		return name;
	}
}
