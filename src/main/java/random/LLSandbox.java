package random;

public class LLSandbox {

	public static void main(String[] args) {

		TLinkedList tll = new TLinkedList(10);
		//tll.printList();
		tll.appendNode(12);
		//tll.printList();
		tll.addNodeAtHead(9);
		tll.insertValueAtIndex(11, 1);
		tll.insertValueAtIndex(13, 3);
		tll.removeFromHead();
		tll.printList();
	}
}

class TLinkedList {

	Node head;
	Node tail;
	int length;

	public TLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length++;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void appendNode(final int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public void addNodeAtHead(final int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		length++;
	}

	public void insertValueAtIndex(final int value, final int index) {
		// 9, 10, 12
		Node previous = head;
		Node newNode = new Node(value);
		for (int i = 0; i < length; i++) {
			if (i == index) {
				Node temp = previous.next;
				previous.next = newNode;
				newNode.next = temp;
				length++;
			}
			previous = previous.next;
		}
	}

	public void removeFromHead() {
		if (head == null) {
			return;
		} else if (length == 1) {
			head.next = null;
			head = null;
			tail = null;
			length--;
		} else {
			Node temp = head.next;
			head.next = null;
			head = temp;
			length--;
		}
	}
}

class Node {

	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}
}
