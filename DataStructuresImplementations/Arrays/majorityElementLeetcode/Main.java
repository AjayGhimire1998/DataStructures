package majorityElementLeetcode;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {

//		int major = nums[0], count = 1;
//		for (int i = 1; i < nums.length; i++) {
//			if (count == 0) {
//				count++;
//				major = nums[i];
//			} else if (major == nums[i]) {
//				count++;
//			} else
//				count--;
//
//		}
//		return major;

		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

}
