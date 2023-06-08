package datastructures.packt.sorting;
import java.util.Arrays;
public class SortingSandbox {
	public static void main(String[] args) {

		int[] array = { 1, 4, 5, 8, 10, 2, 7, 3, 6, 9 };
		//int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//BubbleSortSandbox.sort(array);
		//SelectionSortSandbox.sort(array);
		//InsertionSortSandbox.sort(array);
		int[] sortedArray = MergeSort.sort(array);
		System.out.println("Sorted: " + Arrays.toString(sortedArray));
		//System.out.println("Sorted: " + Arrays.toString(array));
	}
}

class InsertionSortSandbox {
	public static void sort(int[] array) {
		// 1, 4, 5, 8, 10, 2, 7, 3, 6, 9
		for (int i = 1; i < array.length; i++) {
			var current = array[i];
			var k = i - 1;
			while (k >= 0 && array[k] > current) {
				array[k + 1] = array[k]; 		// shift the array element to the right to make room for current
				k--;							// go down the list starting from the i-th location back to the front of the array
			}
			array[k + 1] = current; 			// Place the current value here. we've reached the first spot in the array where array[k] is not
			// greater than current.
		}
	}
}

class SelectionSortSandbox {
	public static void sort(int[] array) {
		int swapCounter = 0;
		int comparisonCounter = 0;
		for (int i = 0; i < array.length; i++) {
			int minValue = array[i]; 				// initialize minValue and minIndex
			int minIndex = i;
			for (int k = i; k < array.length; k++) {
				if (array[k] < minValue) {
					minValue = array[k]; 			// keep track of the new minValue and minIndex
					minIndex = k;
				}
				comparisonCounter++;
			}
			int temp = array[i];
			array[i] = array[minIndex]; 			// make the swap
			array[minIndex] = temp;
			swapCounter++;
		}
		System.out.println("Swap Counter: " + swapCounter);
		System.out.println("Comparison Counter: " + comparisonCounter);
	}
}

class BubbleSortSandbox {

	public static void sort(final int[] array) {
		int swapCounter = 0;
		int comparisonCounter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int k = 1; k < array.length; k++) {
				if (array[k - 1] > array[k]) {
					int temp = array[k - 1];
					array[k - 1] = array[k];
					array[k] = temp;
					swapCounter++;
				}
				comparisonCounter++;
			}
		}
		System.out.println("Swap Counter: " + swapCounter);
		System.out.println("Comparison Counter: " + comparisonCounter);
	}
	public static void sortEnhanced(final int[] array) {
		boolean isSorted;
		int swapCounter = 0;
		int comparisonCounter = 0;
		for (int i = 0; i < array.length; i++) {
			isSorted = true;
			for (int k = 1; k < array.length - i; k++) {
				if (array[k - 1] > array[k]) {
					int temp = array[k - 1];
					array[k - 1] = array[k];
					array[k] = temp;
					isSorted = false;
					swapCounter++;
				}
				comparisonCounter++;
			}
			if (isSorted) {
				System.out.println("Swap Counter: " + swapCounter);
				System.out.println("Comparison Counter: " + comparisonCounter);
				return;
			}
		}
	}
}
