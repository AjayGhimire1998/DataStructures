package reverseAnArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(nums));

//		reverseArray(nums);
//		System.out.println(Arrays.toString(nums));

		swap(nums, 4, nums.length - 1);
		System.out.println(Arrays.toString(nums));

	}

//	public static void reverseArray(int[] data) {
//		int temp;
//		for (int i = 0; i < data.length; i++) {
//			temp = data[i];
//			System.out.println("temp: " + temp);
//
//			data[i] = data[data.length - 1 - i];
//
//			System.out.println("data[i]: " + data[i]);
//
//			data[data.length - 1 - i] = temp;
//			System.out.println(data[data.length - 1 - i]);
//		}
//	}

	public static void swap(int[] data, int start, int end) {
		int temp;

		while (start < end) {
			temp = data[start];
			data[start] = data[end];
			data[end] = temp;
			start++;
			end--;
		}
	}
}
