package datastructures.udemy.queue;

public class Node {

	int value; 		// We could make this generic
	Node next;

	public Node(final int value) {
		this.value = value;
		next = null;
	}
}
