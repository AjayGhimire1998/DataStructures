package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, 5, 7, 2, 9 };
		String str = Arrays.toString(numbers);
		System.out.println(str);
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		System.out.println(copy[1]);
		Arrays.sort(numbers);
//
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		int firstNumber = numbers[0];
		int thirdNumber = numbers[2];
//
		System.out.println("First Number is: " + firstNumber);
		System.out.println("Third Number is: " + thirdNumber);

//		 initialising an array to hold 3 integers
		int[] numbers1 = new int[3];
		numbers1[0] = 10;
		numbers1[1] = 59;
		numbers1[2] = 11;
		System.out.println(numbers1.length); // prints 3

		// adding one more integer
		numbers1[3] = 594;
		System.out.println(numbers1.length); // Error
	}
}
