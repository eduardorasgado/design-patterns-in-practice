package designPrinciples.CompositionOverInheritance.TransportExample.After;

import java.time.ZonedDateTime;
import java.util.Random;

public class RandomBooleanGenerator {
	public static boolean getBoolean() {
		long epochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
		//System.out.println(epochMilli);
		return new Random().nextBoolean();
	}
}
