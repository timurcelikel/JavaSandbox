package datastructures.udemy.linkedlist;
public class LL_Sandbox {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(10);
		ll.append(11);
		ll.append(12);
		ll.addHead(9);
		ll.printNodes();
		System.out.println("------");
		ll.removeHead();
		ll.printNodes();
		System.out.println("------");
		ll.removeTail();
		ll.printNodes();
	}
}

class LinkedList {
	Node head;
	Node tail;
	int length;

	LinkedList(final int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		newNode.value = value;
		length++;
	}

	public void printNodes() {
		Node start = head;
		while (start.next != null) {
			System.out.println(start.value);
			start = start.next;
		}
		System.out.println(start.value);
	}
	public void append(final int value) {
		Node newNode = new Node(value);
		tail.next = newNode;
		tail = newNode;
		length++;
	}

	// also push
	public void addHead(final int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		length++;
	}

	// also pop
	public void removeHead() {
		Node temp = head.next;
		head.next = null;
		head = temp;
		length--;
	}
	public void removeTail() {
		Node start = head;
		Node prev = null;
		while (start != null) {
			if (start.next == null) {
				tail = prev;
				prev.next = null;
				return;
			} else {
				Node temp = start;
				prev = temp;
				start = start.next;
			}
		}
		length--;
	}
}

class Node {
	int value;
	Node next;

	Node(final int value) {
		this.value = value;
	}
}
