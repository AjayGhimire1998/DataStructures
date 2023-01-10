package pseudoRandomNumberGenerationArray;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] data = new int[10];
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(100);
		}
		int[] original = Arrays.copyOf(data, data.length);
		System.out.println("arrays equal before sort: " + Arrays.equals(data, original));
		Arrays.sort(data);
		System.out.println("arrays equal after sort: " + Arrays.equals(data, original));
//		System.out.println(Arrays.asList(data).contains(25));
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("data: " + Arrays.toString(data));

	}

}
