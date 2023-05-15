package datastructures.packt.queue;

public class CircularQueueRunner {

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		CircularQueue<String> queue = new CircularQueue<>(String.class);
		queue.enqueue("hello1");
		queue.enqueue("hello2");
		queue.enqueue("hello3");
		queue.enqueue("hello4");
		queue.enqueue("hello5");
		queue.printQueue();
		String item = queue.dequeue();
		System.out.println("De-queued item: " + item);
	}
}
