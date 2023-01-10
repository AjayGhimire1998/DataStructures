package leetcodeProblems;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;

		merge(nums1, m, nums2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = 0; i < n; i++) {
			nums1[m] = nums2[i];
			m++;
		}

		for (int j = 0; j < nums1.length; j++) {
			int current = nums1[j];
			int k = j;
			while (k > 0 && nums1[k - 1] > current) {
				nums1[k] = nums1[k - 1];
				k--;
			}
			nums1[k] = current;
		}

		System.out.println(Arrays.toString(nums1));
	}

}
