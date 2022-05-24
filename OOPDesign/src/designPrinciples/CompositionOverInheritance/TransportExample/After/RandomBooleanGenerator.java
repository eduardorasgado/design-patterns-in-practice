package designPrinciples.CompositionOverInheritance.TransportExample.After;

import java.time.ZonedDateTime;
import java.util.Random;

public class RandomBooleanGenerator {
	public static boolean getBoolean() {
		return new Random().nextBoolean();
	}
}
