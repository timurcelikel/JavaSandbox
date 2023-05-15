package datastructures.packt.queue;

import java17.generics.sports.Sport;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CircularQueue<T> {

	private static final int SPECIAL_EMPTY_VALUE = -1; 		// To signify there are no elements in the queue
	private static int MAX_SIZE = 5;
	private T[] elements;

	// Initialize both the head and the tail indices to the special value
	private int headIndex = SPECIAL_EMPTY_VALUE;
	private int tailIndex = SPECIAL_EMPTY_VALUE;

	public CircularQueue(Class<T> clazz) {
		// This is how generic arrays are initialized in Java
		elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public void enqueue(T data) throws QueueOverflowException {
		if (isFull()) {
			throw new QueueOverflowException();
		}

		// (-1 + 1) % 5 = 5 goes into 0, zero times, so remainder 0
		// (0 + 1) % 5 = 5 goes into 1 zero times, so remainder 1
		// (1 + 1) % 5 = 5 goes into 2 zero times, so remainder 2
		// (2 + 1) % 5 = 5 goes into 3 zero times, so remainder 3
		// (3 + 1) % 5 = 5 goes into 4 zero times, so remainder 4
		// isFull() check now fails because we have wrapped around with (4 + 1) % 5 = 5 goes into 5, one time, so remainder 0 (back at the head)
		tailIndex = (tailIndex + 1) % elements.length;
		elements[tailIndex] = data;

		if (headIndex == SPECIAL_EMPTY_VALUE) {
			headIndex = tailIndex;
		}
	}

	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException();
		}

		// Head index points to the first element, store that value to return
		T data = elements[headIndex];

		// If the head index is the same as the tail index, then we've just dequeued the very last element
		if (headIndex == tailIndex) {
			headIndex = SPECIAL_EMPTY_VALUE;
		} else {
			// Update the pointer to the new head
			headIndex = (headIndex + 1) & elements.length;
		}

		return data;
	}

	public void printQueue() {

		Arrays.stream(elements).forEach(System.out::println);
	}

	public boolean isEmpty() {
		return headIndex == SPECIAL_EMPTY_VALUE;
	}

	public boolean isFull() {
		int nextIndex = (tailIndex + 1) % elements.length;
		return nextIndex == headIndex;		// Check whether the next position of the tail is the head index
	}
}
