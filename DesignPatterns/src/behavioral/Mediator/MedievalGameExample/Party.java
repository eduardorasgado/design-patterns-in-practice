package behavioral.Mediator.MedievalGameExample;

import java.util.ArrayList;
import java.util.List;

public class Party implements IParty {
	private List<PartyMember> members;
	
	public Party() {
		members = new ArrayList<>();
	}

	@Override
	public void addMember(PartyMember partyMember) {
		members.add(partyMember);
		partyMember.joinedParty(this);
	}

	@Override
	public void act(PartyMember partyMember, Action action) {
		for(PartyMember member : members) {
			if(!partyMember.equals(member)) {
				member.partyAction(action);
			}
		}
	}
}
