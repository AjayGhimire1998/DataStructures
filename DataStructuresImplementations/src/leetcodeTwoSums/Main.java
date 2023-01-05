package leetcodeTwoSums;

public class Main {

	public static void main(String[] args) {
		int[] example = { 3, 3 };
		twoSum(example, 6);

	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] + nums[j - i] == target) {
					return new int[] { j - 1, j };
				}
			}
		}
		return null;
	}

}
