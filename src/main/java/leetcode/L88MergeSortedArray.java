package leetcode;
import java.util.Arrays;
public class L88MergeSortedArray {

	public static void main(String[] args) {

		//int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		//int[] nums2 = { 2, 5, 6 };
		//int m = 3;
		//int n = 3;
		int[] nums1 = {2,0};
		int[] nums2 = {1};
		int m = 1;
		int n = 1;
		//myOriginalMerge(nums1, m, nums2, n);
		betterMerge(nums1, m, nums2, n);
		// Expected: {1, 2, 2, 3, 5, 6}
	}

	public static void betterMerge(int[] nums1, int m, int[] nums2, int n) {
		int pointer = m + n - 1;
		int mPointer = m - 1;
		int nPointer = n - 1;
		while (nPointer >= 0) {
			if (mPointer >= 0 && nums1[mPointer] > nums2[nPointer]) {
				nums1[pointer] = nums1[mPointer];
				mPointer--;
			} else {
				nums1[pointer] = nums2[nPointer];
				nPointer--;
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
					// Unlike the main three pointer approach, here I used insertion sort and just placed where each n array value needs to go and
					// shifted the m array values to the right
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
