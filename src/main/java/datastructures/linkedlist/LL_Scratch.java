package datastructures.linkedlist;

class Node {

	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}
}

class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	public LinkedList(int value) {
		Node temp = new Node(value);
		head = temp;
		tail = temp;
		length = 1;
	}

	public void printList() {
		if (length == 0) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		System.out.println("Printing list...");
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			newNode.next = head;
			head = newNode;
			length++;
		}
	}

	public void append(int value) {
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

	public Node removeLast() {
		if (length == 0) {
			System.out.println("List is empty");
			return null;
		} else if (length == 1) {
			Node temp = tail;
			tail = null;
			head = null;
			length = 0;
			System.out.println("Removed Node: " + temp.value);
			return temp;
		} else {
			Node temp = head;
			Node pre = head;
			while (temp.next != null) {
				pre = temp;
				temp = temp.next;
			}
			tail = pre;
			tail.next = null;
			length--;
			System.out.println("Removed Node: " + temp.value);
			return temp;
		}
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		} else if (length == 1) {
			Node temp = head;
			head = null;
			tail = null;
			length = 0;
			System.out.println("Removed Node: " + temp.value);
			return temp;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			length--;
            /* Instead of checking for length == 1 above we can do that here:
            if (length == 0) {
                tail = null;
            }
            */
			System.out.println("Removed Node: " + temp.value);
			return temp;
		}
	}

	public Node get(int index) {
		int curr = 0;
		if (index == 0) {
			return head;
		} else {
			Node iterator = head.next;
			while (iterator.next != null) {
				curr++;

				if (index == length) {
					return iterator;
				}

				iterator = iterator.next;
			}
		}
	}
}

public class LL_Scratch {
	public static void main(String[] args) {
		System.out.println("Building original list...");
		LinkedList myList = new LinkedList(10);
		myList.printList();
		myList.append(23);
		myList.append(11);
		myList.printList();

		System.out.println("Removing last nodes...");
		myList.removeLast();
		myList.printList();
		myList.removeLast();
		myList.printList();
		myList.removeLast();
		myList.removeLast();

		System.out.println("Prepending nodes...");
		myList.append(100);
		myList.prepend(99);
		myList.prepend(88);
		myList.printList();

		System.out.println("Removing first node...");
		myList.printList();
		myList.removeFirst();
		myList.printList();

		System.out.println("Removing first node again...");
		LinkedList myList2 = new LinkedList(10);
		myList2.printList();
		myList2.removeFirst();
		myList2.printList();
	}
}