package behavioral.Command.RobotExample;

public class HandlerSystem {
	private Motor handlerMotor;
	private int status = 1;
	
	public HandlerSystem(Motor handlerMotor) {
		this.handlerMotor = handlerMotor;
		
		if(handlerMotor == null) status = -1;
	}
		
	public void grab() {
		System.out.println("[ GRABBING ]");
		moveMotor(MotorDirection.LEFT,45, 4);
	}
	
	public void drop() {
		System.out.println("[ DROPPING ]");
		moveMotor(MotorDirection.RIGHT,45, 6);
	}
	
	public void moveMotor(MotorDirection motorDirection, int speed, int movementDuration) {
		handlerMotor.configure(motorDirection, motorDirection.getDirectionNumber() * speed);
		
		int counter = 0;
		while(true) {
			handlerMotor.move();
			
			if(counter >= movementDuration) {
				break;
			} else {
				++counter;
			}
		}
		
		handlerMotor.configure(MotorDirection.NEUTRAL, MotorDirection.NEUTRAL.getDirectionNumber());
		handlerMotor.move();
	}

	public int getStatus() {
		return status;
	}
}
