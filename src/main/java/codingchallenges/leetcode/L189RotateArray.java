package codingchallenges.leetcode;

import java.util.Arrays;

public class L189RotateArray {

	public static void main(String[] args) {

		//int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array = { 1, 2 };
		int k = 3;
		//int k = 2;
		rotate(array, k);

	}

	/*  Input: nums = [1,2,3,4,5,6,7], k = 3
		  Output: [5,6,7,1,2,3,4]
		  [-1,-100,3,99] 2
		  [1, 2] 3 = [2, 1]
	*/
	public static void rotate(int[] nums, int k) {

		int[] rotatedArray = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int diff = nums.length - i;

			// TODO: see if I can get the new value regardless of hitting the end of the array. i.e. no if else just always return the new spot
			//  whether it's 0 or 6
			// length = 7 | k = 3
			// when i = 3 new position should be 6 | 3 - 7 = -4 | 3 - 4 = -1
			// when i = 4 new position should be 0 | -4 | 4 - 4 = 0
			// when i = 5 new position should be 1 | -4 | 5 - 4 = 1

			// length = 2 | k = 3
			// when i = 0 new position should be 1 | 3 - 2 = 1 | 0 - 1 = -1
			// when i = 1 new position should be 0 | 3 - 2 | 1 | 1 - 1 = 0

			if (diff <= k) {
				int newPosition = nums.length - Math.abs(diff + k) - 1;
				rotatedArray[newPosition] = nums[i];
			} else {
				rotatedArray[i + k] = nums[i];
			}
		}
		for (int l = 0; l < nums.length; l++) {
			nums[l] = rotatedArray[l];
		}

		//System.out.println(Arrays.toString(rotatedArray));
		//nums = Arrays.copyOf(rotatedArray, nums.length);
		System.out.println(Arrays.toString(nums));
	}
}
