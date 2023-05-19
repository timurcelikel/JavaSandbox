package datastructures.packt.sorting;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
public class SortTest {

	@Test
	public void testBubbleSort1() {
		int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		BubbleSort.sort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testBubbleSort2() {
		int[] array = { 1, 6, 5, 10, 8, 2, 3, 7, 4, 9 };
		BubbleSort.sort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}
	@Test
	public void testBubbleSort3() {
		int[] array = { 3, 2, 1, 3, 2, 1, 2, 3, 3, 1 };
		BubbleSort.sort(array);
		int[] expectedArray = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 3 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testBubbleSort4() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		BubbleSort.sort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testBubbleSort5() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		BubbleSort.sort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testSelectionSort1() {
		int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		SelectionSort.udemySort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testSelectionSort2() {
		int[] array = { 1, 6, 5, 10, 8, 2, 3, 7, 4, 9 };
		SelectionSort.sort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}
	@Test
	public void testSelectionSort3() {
		int[] array = { 3, 2, 1, 3, 2, 1, 2, 3, 3, 1 };
		SelectionSort.sort(array);
		int[] expectedArray = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 3 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testSelectionSort4() {
		int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		SelectionSort.udemySort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testSelectionSort5() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		SelectionSort.sort(array);
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}
}
