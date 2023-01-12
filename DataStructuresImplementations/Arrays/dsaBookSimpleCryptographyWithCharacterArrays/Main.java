package dsaBookSimpleCryptographyWithCharacterArrays;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String name = "Ajay";
		char[] nameChars = name.toCharArray(); // creates an array of characters of the string
		System.out.println(Arrays.toString(nameChars));

		System.out.println(createString(nameChars));

		System.out.println(Arrays.toString(createAlphabetsArray()));

		// checking the unicode Value for the char types
		for (int i = 65; i <= 90; i++) {
			System.out.println((char) (i));
		}
		String name2 = "Ajay";

		System.out.println('Y' + 1); // gives 90 for Z
		System.out.println((char) ('A' + (0 + 0) % 26));
		System.out.println((char) ('A' + (0 - 1 + 26) % 26));

	}

	public static String createString(char[] chars) { // creates s String from the characters array
		String result = "";

		for (int i = 0; i < chars.length; i++) {
			result += chars[i];
		}
		return result;
	}

	public static char[] createAlphabetsArray() { // create a array of all alphabets characters
		char[] alphabets = new char[26];
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = (char) ('a' + i);
		}
		return alphabets;
	}

}
