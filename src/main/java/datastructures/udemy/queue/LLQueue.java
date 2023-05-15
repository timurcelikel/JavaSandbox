package datastructures.udemy.queue;

public class LLQueue {

	private Node first;
	private Node last;
	private int length = 0;

	public LLQueue(final int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length++;
	}

	public void printQueue() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void enqueue(final int value) {

		Node newNode = new Node(value);

		if (length == 0) {
			first = newNode;
			last = newNode;
		} else {
			// Add to the end
			last.next = newNode;
			last = newNode;
			length++;
		}
	}

	public Node dequeue() {
		if (length == 0) {
			System.out.println("Queue is empty");
			return null;
		}
		Node temp = first;
		first = first.next;
		length--;
		temp.next = null;
		System.out.println(temp.value + " is up next");
		return temp;
	}

	public int getLength() {
		return length;
	}
}
