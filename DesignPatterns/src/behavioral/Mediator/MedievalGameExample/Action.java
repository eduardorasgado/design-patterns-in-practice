package behavioral.Mediator.MedievalGameExample;

public enum Action {
	ENEMY("spotted enemies", "runs for cover"), TALE("tells a tale", "comes to listen"),
	GOLD("found gold", "takes his share of the gold"), HUNT("hunted a rabbit", "arrives for dinner");

	private String action;
	private String reaction;

	private Action(String action, String reaction) {
		this.action = action;
		this.reaction = reaction;
	}

	public String getAction() {
		return action;
	}

	public String getReaction() {
		return reaction;
	}
}
