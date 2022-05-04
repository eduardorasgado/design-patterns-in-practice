package creational.Builder.CarExample.Model;

public abstract class Engine {
	private int hp;
	
	protected abstract void turnOn();
	protected abstract void turnOff();
	
	public int getHp() {
		return hp;
	}
	
	protected void setHp(int hp) {
		this.hp = hp;
	}
}
