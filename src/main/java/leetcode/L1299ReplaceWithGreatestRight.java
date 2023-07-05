package leetcode;
import java.util.Arrays;
public class L1299ReplaceWithGreatestRight {

	/*
		Given an array arr, replace every element in that array with the greatest element
		among the elements to its right, and replace the last element with -1.
	*/
	public static void main(String[] args) {
		System.out.println(Arrays.toString(betterReplaceElements(new int[] { 17, 18, 5, 4, 6, 1 })));
	}

	public static int[] betterReplaceElements(int[] arr) {
		// O(N) Solution from Discussions
		// { 17, 18, 5, 4, 6, 1 }
		// Expected: [18,6,6,6,1,-1]
		int max = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			int temp = arr[i - 1];
			arr[i - 1] = max;
			if (temp > max) {
				max = temp;
			}
		}
		arr[arr.length - 1] = -1;
		return arr;
	}

	public static int[] replaceElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr.length > i + 1) {
				int maxValue = arr[i + 1];
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[k] > maxValue) {
						maxValue = arr[k];
					}
				}
				arr[i] = maxValue;
			}
		}
		arr[arr.length - 1] = -1;
		return arr;
	}
}
