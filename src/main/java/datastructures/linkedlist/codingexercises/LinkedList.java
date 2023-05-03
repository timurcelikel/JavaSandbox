package datastructures.linkedlist.codingexercises;
public class LinkedList {
	private final Node head;
	private final Node tail;
	private final int length;
	public LinkedList(final int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	public Node getHead() {
		return head;
	}
	public Node getTail() {
		return tail;
	}
	public int getLength() {
		return length;
	}
	public void printAll() {
		System.out.println("Head: " + head.value);
		System.out.println("Tail: " + tail.value);
		System.out.println("Length: " + length);
	}
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	class Node {
		int value;
		Node next;
		public Node(final int value) {
			this.value = value;
		}
	}
}
