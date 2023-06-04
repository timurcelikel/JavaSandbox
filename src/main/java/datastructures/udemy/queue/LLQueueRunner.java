package datastructures.udemy.queue;

import java.util.ArrayList;
import java.util.List;

public class LLQueueRunner {

	public static void main(String[] args) {

		LLQueue queue = new LLQueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		System.out.println("--- Before dequeue() ---");
		queue.printQueue();
		queue.dequeue();
		System.out.println("--- After dequeue() ---");
		queue.printQueue();

		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		System.out.println("ints: " + ints);

		ints.remove(ints.size() - 1);
		System.out.println("ints: " + ints);
	}
}
