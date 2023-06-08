package datastructures.packt.sorting;

import java.util.Arrays;

public class SortingSandbox2 {

	public static void main(String[] args) {

		int[] array = { 1, 4, 5, 8, 10, 2, 7, 3, 6, 9 };
		//BubbleSortSandbox2.sort(array);
		//SelectionSortSandbox2.sort(array);
		InsertionSortSandbox2.sort(array);
		System.out.println("Sorted: " + Arrays.toString(array));
	}
}

class BubbleSortSandbox2 {
	public static void sort(int[] array) {
		// Bubble Sort compare each item to the previous item and swap
		for (int i = 0; i < array.length; i++) {
			for (int k = 1; k < array.length; k++) {
				if (array[k-1] > array[k]) {
					// 1: 1 and 4
					// 2: 4 and 5
					// 3:
					int temp = array[k-1];
					array[k-1] = array[k];
					array[k] = temp;
				}
				// 1, 4, 5, 8, 10, 2
			}
		}
	}
}

class SelectionSortSandbox2 {
	public static void sort(int[] array) {
		// Selection Sort determine the array index of the lowest value and swap
		for (int i = 0; i < array.length; i++) {
			int minValue = array[i];
			int minIndex = i;
			for (int k = i; k < array.length; k++) {
				if (array[k] < minValue) {
					minValue = array[k];
					minIndex = k;
				}
			}
			if (array[i] != minValue) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}
}

class InsertionSortSandbox2 {
	public static void sort(int[] array) {
		// 1, 4, 5, 8, 10, 2, 7, 3, 6, 9
		// Insertion Sort compare each item to determine wat index in the array this item belongs at
		for (int i = 0; i < array.length; i++) {
			int current = array[i];	// item we are currently processing
			int k = i - 1;
			while (k >= 0 && array[k] > current) {
				array[k + 1] = array[k]; 		// shift to the right
				k--;
			}
			array[k+1] = current; 				// we found where our value is supposed to go
		}
	}
}
