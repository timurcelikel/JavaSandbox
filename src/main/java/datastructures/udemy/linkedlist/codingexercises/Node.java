package datastructures.udemy.linkedlist.codingexercises;

public class Node {
	private int value;
	private Node next;

	public Node(final int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	public void setValue(final int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(final Node next) {
		this.next = next;
	}
}
