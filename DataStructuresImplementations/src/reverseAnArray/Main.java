package reverseAnArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(nums));

		reverseArray(nums);
		System.out.println(Arrays.toString(nums));

		swap(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));

		ArrayList<Integer> nums2 = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			nums2.add(i);
		}
		System.out.println(nums2);
		reverseArrayList(nums2);
		System.out.println(nums2);

	}

	public static void reverseArray(int[] data) {
		int temp;
		for (int i = 0; i < data.length / 2; i++) {
			temp = data[i];
			System.out.println("temp: " + temp);

			data[i] = data[data.length - 1 - i];

			System.out.println("data[i]: " + data[i]);

			data[data.length - 1 - i] = temp;
			System.out.println(data[data.length - 1 - i]);
			System.out.println(Arrays.toString(data));
		}
	}

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

	public static void reverseArrayList(ArrayList<Integer> nums) {
		int temp;
		for (int i = 0; i < nums.size() / 2; i++) {

			temp = nums.get(i);
			nums.set(i, nums.get(nums.size() - i - 1));
			nums.set(nums.size() - i - 1, temp);
		}
	}
}
