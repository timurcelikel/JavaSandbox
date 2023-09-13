package codingchallenges.leetcode;

import java.util.Arrays;

public class L27RemoveElement {

	/*
	Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
	The order of the elements may be changed. Then return the number of elements in nums which are
	not equal to val.
	*/

	public static void main(String[] args) {

		//System.out.println(betterRemoveElement(new int[] { 3, 2, 2, 3 }, 3));
		System.out.println(myOriginalRemoveElement(new int[] { 3, 2, 2, 3 }, 3));
	}

	public static int betterRemoveElement(int[] nums, int value) {
		// {3, 2, 2, 3}
		// returns: 2 for input of 3
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != value) {
				nums[index] = nums[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return index;
	}

	public static int myOriginalRemoveElement(int[] nums, int val) {
		// 1. Iterate first loop from start to end
		// 2. When a val match is found iterate a second loop from end to start and swap
		// 3. Keep a counter of first loop non-matches
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				for (int j = nums.length - 1; j > i; j--) {
					if (nums[j] != val) {
						// Swap
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				k++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return k;
	}
}
