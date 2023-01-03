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

//		int firstNumber = numbers[0];
//		int thirdNumber = numbers[2];
//
//		System.out.println("First Number is: " + firstNumber);
//		System.out.println("Third Number is: " + thirdNumber);
	}
}

// initialising an array to hold 3 integers
//int[] numbers = new int[3];
//numbers[0] = 10;
//numbers[1] = 59;
//numbers[2] = 11;
//System.out.println(numbers.length); // prints 3
//
//// adding one more integer
//numbers[3] = 594;
//System.out.println(numbers.length); // Error
