package leetcodeTwoSums;

public class Main {

	public static void main(String[] args) {
		int[] example = { 3, 2, 4 };
		twoSum(example, 6);

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			int j = i;
			while (j >= 0 && current + nums[j + 1] == target) {
				result[0] = current;
				System.out.println(result[0]);
				result[1] = nums[j + 1];
				System.out.println(result[1]);

			}
		}
		return result;
	}

}
