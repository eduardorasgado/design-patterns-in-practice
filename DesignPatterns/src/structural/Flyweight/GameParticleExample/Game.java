package structural.Flyweight.GameParticleExample;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.EnumMap;

import static java.util.Objects.isNull;

public class Game {
	private List<MovingParticle> movingParticles;
	private static Map<WeaponType, Particle> particles;
	
	static {
		particles = new EnumMap<WeaponType, Particle>(WeaponType.class);
	}
	public Game() {
		this.movingParticles = new ArrayList<MovingParticle>();
				
	}

	public void addParticle(Coordinate originCoordinate, Coordinate targetCoordinate, WeaponType weaponType, String particleColor) {
		Particle particle = getParticle(weaponType, particleColor);

		MovingParticle movingParticle = new MovingParticle(originCoordinate, particle, 100);
		movingParticle.moveTo(targetCoordinate);
		System.out.println("[shot]...");
		movingParticles.add(movingParticle);
	}
	
	public Particle getParticle(WeaponType weaponType, String particleColor) {
		Particle particle = particles.get(weaponType);
		if(isNull(particle)) {
			particle = new Particle(weaponType.getBulletSprite(), particleColor);
			particles.put(weaponType, particle);
		}
		System.out.println("[particle id: ]" + System.identityHashCode(particle));
		return particle;
	}
		
}
