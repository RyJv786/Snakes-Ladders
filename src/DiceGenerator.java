import java.util.Random;

public class DiceGenerator {

	private Random Generator;

//Generates random number between 1-6
	public int rollD6() {
		// This actually goes from 0-5 so added 1 to make 1-6
		return Generator.nextInt(6) + 1;
	}

	public DiceGenerator() {
		Generator = new Random();
	}
}
