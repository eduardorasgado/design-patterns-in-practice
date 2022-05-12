package doubleDispatch.TableDrivenMethod.SpaceExample.Model;

import java.util.HashMap;
import java.util.Map;

public abstract class SpaceObject {
	private String material;
	private int speed;
	private int mass;
	private int integrity;

	private Map<Class<?>, CollitionHandler<SpaceObject>> collitionMap;
	private Map<CoordinateType, Integer> coordinates;

	public SpaceObject(String material, int speed, int mass, int integrity) {
		this.material = material;
		this.speed = speed;
		this.mass = mass;
		this.integrity = integrity;
		collitionMap = new HashMap<>();
		coordinates = new HashMap<>();
	}
	
	protected abstract void initCollitionMap();
	protected abstract void initCoordinates();
	protected abstract void initIntegrity();
	
	public void collideWith(SpaceObject object) {
		CollitionHandler<SpaceObject> handler = getCollitionMap().get(object.getClass());
		handler.collideWith(object);
	}

	protected Map<Class<?>, CollitionHandler<SpaceObject>> getCollitionMap() {
		return collitionMap;
	}

	protected Map<CoordinateType, Integer> getCoordinates() {
		return coordinates;
	}

	protected String getMaterial() {
		return material;
	}

	protected int getSpeed() {
		return speed;
	}

	protected int getMass() {
		return mass;
	}
	
	public int getIntegrity() {
		return integrity;
	}

	protected void setIntegrity(int integrity) {
		this.integrity = integrity;
	}
}
