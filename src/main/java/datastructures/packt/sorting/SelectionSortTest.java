package datastructures.packt.sorting;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
public class SelectionSortTest {

	@Test
	public void testSelectionSort1() {
		int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		int[] sortedArray = SelectionSort.selectionSort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(sortedArray));
	}

	@Test
	public void testSelectionSort2() {
		int[] array = { 1, 6, 5, 10, 8, 2, 3, 7, 4, 9 };
		int[] sortedArray = SelectionSort.selectionSort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(sortedArray));
	}
	@Test
	public void testSelectionSort3() {
		int[] array = { 3, 2, 1, 3, 2, 1, 2, 3, 3, 1 };
		int[] sortedArray = SelectionSort.selectionSort(array);
		int[] expectedArray = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 3 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(sortedArray));
	}
}
