package doubleDispatch.TableDrivenMethod.SpaceExample;

import doubleDispatch.TableDrivenMethod.SpaceExample.Model.Asteroid;
import doubleDispatch.TableDrivenMethod.SpaceExample.Model.Planet;
import doubleDispatch.TableDrivenMethod.SpaceExample.Model.Spaceship;

public class SpaceDemo {
	public static void main(String[] args) {
		Spaceship spaceship = new Spaceship("titaniium", 300, 20, "Red Flag");
		Asteroid asteroid = new Asteroid(4000, "Rock", 50, 1000, 5);
		
		spaceship.collideWith(asteroid);
		System.out.println(spaceship.getIntegrity());
		
		asteroid.collideWith(spaceship);
		System.out.println(asteroid.getIntegrity());
		
		spaceship = new Spaceship("titaniium", 300, 2000, "Red Flag");
		asteroid = new Asteroid(4000, "Rock", 50, 100, 5);
		
		System.out.println("----------------");
		spaceship.collideWith(asteroid);
		System.out.println(spaceship.getIntegrity());
		
		asteroid.collideWith(spaceship);
		System.out.println(asteroid.getIntegrity());
		
		Planet planet = new Planet("Rock", 10, 10000, "Proteus");
		
		planet.collideWith(asteroid);
		System.out.println(planet.getIntegrity());
		
		asteroid.collideWith(planet);
		System.out.println(asteroid.getIntegrity());		
	}
}
