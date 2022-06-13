package structural.Flyweight.GameParticleExample;

public class Shot {
	private int shotRange;
	private int shotRecoil;
	
	public Shot(int shotRange, int shotRecoil) {
		super();
		this.shotRange = shotRange;
		this.shotRecoil = shotRecoil;
	}
	public int getShotRange() {
		return shotRange;
	}
	public int getShotRecoil() {
		return shotRecoil;
	}
}
