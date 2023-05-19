package datastructures.packt.sorting;

import java.util.Arrays;
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		packtSort(array);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(array));        // This also works instead of looping
	}
	public static void sort(final int[] array) {
		int swapCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int k = i + 1; k < array.length; k++) {
				if (array[k] < array[i]) {
					int temp = array[k];
					array[k] = array[i];
					array[i] = temp;
					swapCount++;
				}
			}
		}
		System.out.println("Swap Count: " + swapCount);
	}

	public static void udemySort(int[] array) {
		int swapCount = 0;
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int k = i + 1; k < array.length; k++) {
				if (array[k] < array[minIndex]) {
					minIndex = k;
				}
			}
			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
				swapCount++;
			}
		}
		System.out.println("Swap Count: " + swapCount);
	}
	private static void printArray(int[] array) {
		for (int value : array) {
			System.out.println(value);
		}
	}
	public static void packtSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
