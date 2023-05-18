package datastructures.packt.sorting;
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		int[] sortedArray = selectionSort(array);
		System.out.println("Sorted array: ");
		printArray(sortedArray);
	}
	public static int[] selectionSort(final int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array.length; k++) {
				if (array[k] > array[i]) {
					int temp = array[k];
					array[k] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	private static void printArray(int[] array) {
		for (int value : array) {
			System.out.println(value);
		}
	}
}
