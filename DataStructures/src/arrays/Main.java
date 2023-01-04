package arrays;

import java.util.ArrayList;
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

		int[][] ints = { { 1, 5 }, { 2, 6 }, { 3, 4 } };
		String arrayyy = Arrays.toString(ints);
		System.out.println(arrayyy);

		// adding one more integer
//		numbers1[3] = 594;
		System.out.println(numbers1.length); // Error

		ArrayList<String> strArr = new ArrayList<>(1);
		strArr.add("Hehe");
		System.out.println(strArr);
		strArr.add("HUUUUU");
		System.out.println(strArr);
		System.out.println(strArr.contains("Hehe"));

		strArr.add("OKOKOK");
		strArr.add(str);
		System.out.println(strArr);

		strArr.remove(str);
		System.out.println(strArr);

		// Automatic boxing and Unboxing

//		int j = 8;
//		Integer a = new Integer(12); //deprecated
//		int k = a;

		// declaring array
		int[] primes = new int[10];
		System.out.println(primes[1]); // if the item type is numberic, its default is "o".

		boolean[] states = new boolean[10];
		System.out.println(states[2]); // for boolean, default is always "false:

		String[] strings = new String[10];
		System.out.println(strings[4]); // for reference types, default is null.

		// iterating through arrays
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (String day : days) {
			System.out.println(day);
		}

		for (int i = 0; i < days.length; i++) {
			System.out.println("for loop: " + days[i]);
		}

		// using while loop
		int j = 0;
		while (j < days.length) {
			System.out.println("while loop: " + days[j]);
			j++;
		}

		// using do-while loop
		int k = 0;
		do {
			System.out.println("do-while loop: " + days[k]);
			k++;
		} while (k < days.length);

		// filling an array
		String[] months = new String[12];
		Arrays.fill(months, "JANUARY");
		String readMonths = Arrays.toString(months);
		System.out.println("THe array of months: " + readMonths);

		// sorting an array
		String[] names = { "Ajay", "Arjun", "Sia", "Bimal", "Shuvam" };
		Arrays.sort(names);
		String readNames = Arrays.toString(names);
		System.out.println("The array of names: " + readNames);

		// binary searching an array
		String[] names1 = { "Ajay", "Arjun", "Sia", "Bimal", "Shuvam" };
		Arrays.sort(names1); // sorts first
		int index = Arrays.binarySearch(names1, "Bimal"); // searches speciffic value
		System.out.println("The index of Bimal: " + index);

	}

}
