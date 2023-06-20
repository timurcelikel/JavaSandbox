package leetcode;
import java.util.Arrays;
public class L88MergeSortedArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		//myOriginalMerge(nums1, m, nums2, n);
		betterMerge(nums1, m, nums2, n);
		// Expected: {1, 2, 2, 3, 5, 6}
	}

	// TODO: Fix for nums1[0], m=0, nums2[1], n=1 | Expected: [1]
	public static void betterMerge(int[] nums1, int m, int[] nums2, int n) {
		int pointer = m + n - 1;
		int mPointer = m - 1;
		int nPointer = n - 1;
		while (pointer > 0) {
			if (nums2[nPointer] > nums1[mPointer]) {
				nums1[pointer] = nums2[nPointer];
				nPointer--;
			} else {
				nums1[pointer] = nums1[mPointer];
				mPointer--;
			}
			pointer--;
		}
		System.out.println(Arrays.toString(nums1));
	}

	public static void myOriginalMerge(int[] nums1, int m, int[] nums2, int n) {
		// 1, 2, 3, 0, 0, 0  --  2, 5, 6
		int swapCount = 0;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < nums1.length; k++) {
				if (nums2[i] <= nums1[k]) {
					for (int l = nums1.length - 2; l >= k; l--) {
						nums1[l + 1] = nums1[l];
					}
					nums1[k] = nums2[i];
					k = k + 2;
					swapCount++;
					break;
				}
			}
		}
		if (swapCount < n) {
			for (int j = swapCount; j < n; j++) {
				nums1[nums1.length + j - n] = nums2[j];
			}
		}
		System.out.println(Arrays.toString(nums1));
	}
}
