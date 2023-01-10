package leetcodeProblems;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		System.out.println(searchInsert(nums, 7));
	}

	public static int searchInsert(int[] nums, int target) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				count = i;
				break;
			} else if (target > nums[i]) {
				count++;
			}

		}
		return count;
	}

}
