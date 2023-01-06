package leetcodeRemoveDuplicates;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 7 };
		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {
		int slow = 0;
		int fast = 1;
		while (fast < nums.length) {
			if (nums[fast] != nums[slow]) {
				slow++;
				nums[slow] = nums[fast];
			}
			fast++;
		}
		return slow + 1;

	}

}
