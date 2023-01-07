package plusOneLeetcode;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] digits = { 7, 9, 9 };
		System.out.println(Arrays.toString(plusOne(digits)));

	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;

				return digits;
			}
			digits[i] = 0;

		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		System.out.println(Arrays.toString(digits));
		return digits;
	}

}
