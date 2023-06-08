package datastructures.packt.sorting;
import java.util.Arrays;
public class SortingSandbox3 {

	public static void main(String[] args) {
		int[] array = { 4, 2, 5, 1, 3 };
		Sorting.bubbleSort(array);
		//Sorting.selectionSort(array);
		//Sorting.insertionSort2(array);
		System.out.println(Arrays.toString(array));
	}
}

class Sorting {
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int k = 1; k < array.length - i; k++) {
				if (array[k - 1] > array[k]) {
					// swap
					int temp = array[k - 1];
					array[k - 1] = array[k];
					array[k] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minValue = array[i];
			int minIndex = i;
			for (int k = i; k < array.length; k++) {
				if (array[k] < minValue) {
					minIndex = k;
					minValue = array[k];
				}
			}
			int temp = array[i];
			array[i] = minValue;
			array[minIndex] = temp;
		}
	}

	public static void insertionSort2(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int k = i - 1;
			while (k >= 0 && array[k] > current) {
				// shift values to the right
				array[k + 1] = array[k];
				k--;
			}
			// insert into correct spot
			array[k + 1] = current;
		}
	}

	public static void insertionSort(int[] array) {
		// 4, 2, 5, 1, 3
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int k = i - 1;
			while (k >= 0 && array[k] > current) {
				array[k + 1] = array[k];
				k--;
			}
			array[k + 1] = current;
		}
	}
}
