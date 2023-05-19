package datastructures.packt.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		packtSort(array);
		System.out.println("Array: " + Arrays.toString(array));
	}

	public static void sort(final int[] array) {
		int comparisonCounter = 0;
		int swapCounter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int k = i + 1; k < array.length; k++) {
				if (array[i] > array[k]) {
					int temp = array[i];
					array[i] = array[k];
					array[k] = temp;
					swapCounter++;
				}
				comparisonCounter++;
			}
		}
		System.out.println("Comparison Counter: " + comparisonCounter);
		System.out.println("Swap Counter: " + swapCounter);
	}

	public static void packtSort(final int[] array) {
		int comparisonCounter = 0;
		int swapCounter = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int k = i + 1; k > 0; k--) {
				comparisonCounter++;
				if (array[k] < array[k - 1]) {
					int temp = array[k];
					array[k] = array[k - 1];
					array[k - 1] = temp;
					swapCounter++;
				} else {
					break;
				}
			}
		}
		System.out.println("Comparison Counter: " + comparisonCounter);
		System.out.println("Swap Counter: " + swapCounter);
	}

	public static void udemySort(final int[] array) {
		int comparisonCounter = 0;
		int swapCounter = 0;
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while (j > -1 && temp < array[j]) {
				array[j + 1] = array[j];
				array[j] = temp;
				swapCounter++;
				comparisonCounter++;
				j--;
			}
		}
		System.out.println("Comparison Counter: " + comparisonCounter);
		System.out.println("Swap Counter: " + swapCounter);
	}
}
