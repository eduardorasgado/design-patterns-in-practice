package behavioral.Command.RobotExample;

public class Motor {
	private MotorDirection direction;
	private double speed = 0;

	public Motor(MotorDirection direction) {
		this.direction = direction;
	}
	
	public void configure(MotorDirection motorDirection, double speed) {
		direction = motorDirection;
		this.speed = speed;
	}
	
	public void configure(double speed) {
		configure(direction, speed);
	}
	
	public void move() {
		System.out.println("[ motor is moving in " + direction + " direction and " + speed + " speed ]");
	}
}
