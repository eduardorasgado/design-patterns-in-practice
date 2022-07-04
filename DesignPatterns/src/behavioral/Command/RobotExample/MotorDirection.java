package behavioral.Command.RobotExample;

public enum MotorDirection {
	LEFT(-1), NEUTRAL(0), RIGHT(1);
	
	private int directionNumber;

	private MotorDirection(int directionNumber) {
		this.directionNumber = directionNumber;
	}

	public int getDirectionNumber() {
		return directionNumber;
	}
}
