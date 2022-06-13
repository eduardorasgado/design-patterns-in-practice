package structural.Flyweight.GameParticleExample;

public enum WeaponShotType {
	MACHINEGUN(30, 20),
	AUTOMATIC_RIFLE(50, 10);

	private int shotRange;
	private int shotRecoil;
	
	private WeaponShotType(int shotRange, int shotRecoil) {
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
