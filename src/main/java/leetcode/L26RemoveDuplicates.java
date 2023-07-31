package leetcode;

import java.util.Arrays;

public class L26RemoveDuplicates {

	/*
		Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
		such that each unique element appears only once. The relative order of the elements should
		be kept the same. Then return the number of unique elements in nums.
	*/

	public static void main(String[] args) {

		//System.out.println(removeDuplicates(new int[]{1, 1, 2}));
		//System.out.println(myOriginalRemoveDuplicates(new int[]{1, 2}));
		System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
	}

	public static int removeDuplicates(int[] nums) {
		// {0,0,1,1,1,2,2,3,3,4}
		/*
			index = 0
			i = 0
			nums[0] = 0
			nums[1] = 0
			nums[2] = 1
			nums[3] = 1
			nums[4] = 2

			Note: nums[index] for index 0 will always be nums[0]

			nums[0] != nums[2]
			index = 1
			nums[index] = 1

			nums[1] = nums[4]
			index = 2
			nums[index] = 2
		 */
		if (nums.length == 1) {
			return 1;
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[index]) {
				index++;
				nums[index] = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
		return index + 1;
	}

	public static int myOriginalRemoveDuplicates(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int uniqueCount = nums.length - 1;
		// [1,1,2]
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				// shift everyone down
				int j = i;
				boolean condition = true;
				while (condition) {
					if (j == nums.length - 1) {
						condition = false;
						break;
					}
					nums[j] = nums[j + 1];
					j++;
				}
				if (nums[i] == nums[nums.length - 1]) {
					break;
				}
				i--;
				System.out.println(Arrays.toString(nums));
				uniqueCount--;
			} else {

			}
		}
		System.out.println(Arrays.toString(nums));
		return uniqueCount;
	}
}
