package singleNumberLeetcode;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 4, 6, 4, 1, 6 };
		System.out.println(singleNumber(nums));

	}

	public static int singleNumber(int[] nums) {
		int singleNum = 0;
		int i = 0;

		for (int j = 0; j < nums.length; j++) {
			int current = nums[i];
			int k = i;

			while (k > 0 && nums[k - 1] > current) {
				nums[k] = nums[k - 1];
				k--;
			}
			nums[k] = current;
		}

		for (int l = 0; l < nums.length; l++) {
			for (int m = 1; m < nums.length; m++) {
				if (nums[m] != nums[l]) {
					singleNum = nums[l];
				}
			}
		}

		return singleNum;
	}
}
