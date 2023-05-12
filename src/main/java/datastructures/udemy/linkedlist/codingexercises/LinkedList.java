package datastructures.udemy.linkedlist.codingexercises;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	public LinkedList(final int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printAll() {
		System.out.println("Head: " + head.getValue());
		System.out.println("Tail: " + tail.getValue());
		System.out.println("Length: " + length);
	}

	public int getSize() {
		return length;
	}

	public void printList() {
		if (length == 0) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		System.out.println("Printing list...");
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			newNode.setNext(head);
			head = newNode;
		}
		length++;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		length++;
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		} else if (length == 1) {
			Node temp = head;
			head = null;
			tail = null;
			length = 0;
			System.out.println("Removed Node: " + temp.getValue());
			return temp;
		} else {
			Node temp = head;
			head = head.getNext();
			temp.setNext(null);
			length--;
            /* Instead of checking for length == 1 above we can do that here:
            if (length == 0) {
                tail = null;
            }
            */
			System.out.println("Removed Node: " + temp.getValue());
			return temp;
		}
	}
	public Node removeLast() {
		if (length == 0) {
			System.out.println("List is empty");
			return null;
		} else if (length == 1) {
			Node temp = tail;
			tail = null;
			head = null;
			length = 0;
			temp.setNext(null);
			System.out.println("Removed Node: " + temp.getValue());
			return temp;
		} else {
			Node temp = head;
			Node pre = head;
			while (temp.getNext() != null) {
				pre = temp;
				temp = temp.getNext();
			}
			tail = pre;
			tail.setNext(null);
			length--;
			System.out.println("Removed Node: " + temp.getValue());
			return temp;
		}
	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			System.out.println("No node found at index: " + index);
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		System.out.println("Returning Node: " + temp.getValue() + " at index " + index);
		return temp;
	}

	public boolean set(int index, int value) {
		Node node = get(index);
		if (node != null) {
			node.setValue(value);
			return true;
		} else {
			return false;
		}
	}

	// 10 12 13 14
	public boolean insert(int index, int value) {
		if (index < 0 || index > length) {
			System.out.println("No node found at index: " + index);
			return false;
		} else if (index == 0) {
			prepend(value);
			return true;
		} else if (index == length) {
			append(value);
			return true;
		} else {
			Node prevNode = get(index - 1);
			Node node = prevNode.getNext();
			if (node != null) {
				Node newNode = new Node(value);
				newNode.setNext(node);
				prevNode.setNext(newNode);
				length++;
				return true;
			}
		}
		return false;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length) {
			System.out.println("No node found at index: " + index);
			return null;
		} else if (index == 0) {
			return removeFirst();
		} else {
			Node prevNode = get(index - 1);
			Node temp = prevNode.getNext();
			prevNode.setNext(temp.getNext());
			temp.setNext(null);
			length--;
			System.out.println("Removed node: " + temp.getValue());
			return temp;
		}
	}

	public void reverse() {
		if (length != 0) {
			for (int i = length; i >= 2; i--) {
				Node temp = get(i - 1);
				Node prevNode = get(i - 2);
				temp.setNext(prevNode);
				if (i - 2 == 0) {
					prevNode.setNext(null);
					Node place;
					place = tail;
					tail = head;
					head = place;
				}
			}
		}
	}

	public void udemyReverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.getNext();
		Node before = null;
		for (int i = 0; i < length; i++) {
			after = temp.getNext();
			temp.setNext(before);
			before = temp;
			temp = after;
		}
	}
}