package datastructures.udemy.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LLQueueTest {

	@Test
	public void testEnqueue() {

		LLQueue queue = new LLQueue(10);
		queue.enqueue(11);
		assertEquals(2, queue.getLength());
	}

	@Test
	public void testDequeueWithMultiItem() {

		LLQueue queue = new LLQueue(10);
		queue.enqueue(11);
		queue.dequeue();
		assertEquals(1, queue.getLength());
	}

	@Test
	public void testDequeueWithOneItem() {

		LLQueue queue = new LLQueue(10);
		queue.enqueue(11);
		queue.dequeue();
		queue.dequeue();
		assertEquals(0, queue.getLength());
	}

	@Test
	public void testDequeueWithNoItems() {

		LLQueue queue = new LLQueue(10);
		queue.enqueue(11);
		Node firstItem = queue.dequeue();
		Node secondItem = queue.dequeue();
		Node thirdItem = queue.dequeue();
		assertEquals(0, queue.getLength());
		assertEquals(10, firstItem.value);
		assertEquals(11, secondItem.value);
		assertNull(thirdItem);
	}
}
