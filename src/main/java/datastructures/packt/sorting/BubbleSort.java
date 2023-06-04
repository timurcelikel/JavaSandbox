package datastructures.packt.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		int[] array = { 1, 4, 5, 8, 10, 2, 7, 3, 6, 9 };

		packtSort(array);
		System.out.println("Array: " + Arrays.toString(array));
	}

	public static void sort(final int[] array) {
		int comparisonCounter = 0;
		int counter = 0;
		int swapCounter = 0;

		for (int i = array.length - 1; i > 0; i--) {
			for (int k = array.length - 1; k > counter; k--) {
				if (array[k - 1] > array[k]) {
					int temp = array[k];
					array[k] = array[k - 1];
					array[k - 1] = temp;
					swapCounter++;
				}
				comparisonCounter++;
			}
			counter++;
			if (swapCounter == 0) {
				System.out.println("Comparison Counter 1: " + comparisonCounter);
				return;
			}
		}
		System.out.println("Swap Counter: " + swapCounter);

		System.out.println("Comparison Counter: " + comparisonCounter);
	}

	public static void packtSort(int[] array) {
		int comparisonCounter = 0;
		int swapCounter = 0;

		for (int i = 0; i < array.length; i++) {
			boolean swapped = false;
			for (int k = array.length - 1; k > i; k--) {
				if (array[k] < array[k - 1]) {
					int temp = array[k];
					array[k] = array[k - 1];
					array[k - 1] = temp;
					swapped = true;
					swapCounter++;
				}
				comparisonCounter++;
			}
			if (!swapped) {
				System.out.println("Comparison Counter 1: " + comparisonCounter);
				System.out.println("Swap Counter: " + swapCounter);

				return;
			}
		}
		System.out.println("Comparison Counter 2: " + comparisonCounter);
	}

	public static void udemySort(int[] array) {
		int swapCounter = 0;

		for (int i = array.length - 1; i > 0; i--) {
			for (int k = 0; k < i; k++) {
				if (array[k] > array[k + 1]) {
					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
					swapCounter++;
				}
			}
		}
		System.out.println("Swap Counter: " + swapCounter);
	}
}
