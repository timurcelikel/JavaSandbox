package datastructures.packt.sorting;
import java.util.Arrays;
public class MergeSort {

	public static int[] sort(int[] array) {

		return mergeSort(array);
	}

	private static int[] mergeSort(int[] array) {
		if (array.length == 1) {
			return array;
		}
		int midIndex = array.length / 2; // if length is odd 1.5 is an integer so we would get 1
		int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex)); // Copy from beginning of array up to and not including midIndex
		int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

		return merge(left, right);
	}

	private static int[] merge(int[] array1, int[] array2) {
		// Both arrays have to be pre-sorted
		int[] combined = new int[array1.length + array2.length];
		int index = 0;    // index of combined array
		int i = 0;        // index of array1
		int j = 0;        // index of array2
		while (i < array1.length && j < array2.length) {
			// This while loop will run until either array1 or array2 is empty
			if (array1[i] < array2[j]) {
				combined[index] = array1[i];
				index++;
				i++;
			} else {
				combined[index] = array2[j];
				index++;
				j++;
			}
		}

		// Now either array1 or array2 is empty
		while (i < array1.length) {
			// while array1 still has items in it
			combined[index] = array1[i];
			index++;
			i++;
		}

		while (j < array2.length) {
			// while array2 still has items in it
			combined[index] = array2[j];
			index++;
			j++;
		}
		return combined;
	}
}
