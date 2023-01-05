package leetcodeTwoSums;

public class Main {

	public static void main(String[] args) {
		int[] example = { 3, 3 };
		twoSum(example, 6);

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {

			int current = nums[i];

			for (int j = 1; j < nums.length; j++) {
				if (current + nums[j] == target) {
					result[0] = i;
					System.out.println(result[0]);
					result[1] = j;
					System.out.println(result[1]);
				}
			}
		}
		return result;
	}

}
