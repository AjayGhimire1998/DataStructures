package pseudoRandomNumberGenerationArray;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

	}

	public static void randomNumberFormulaByJava(int a, int b, int n) {
		int next = 0;

		Random random = new Random();
		random.setSeed((long) 100.0);
		System.out.println(random.nextDouble());
	}

}
