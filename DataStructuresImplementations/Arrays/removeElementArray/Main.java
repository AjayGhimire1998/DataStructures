package removeElementArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 3, 2 };
		System.out.println(removeElement(nums, 2));
	}

	public static int removeElement(int[] nums, int val) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return count;
	}
}
