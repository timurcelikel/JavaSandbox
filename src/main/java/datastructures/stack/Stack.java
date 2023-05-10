package datastructures.stack;
import datastructures.linkedlist.codingexercises.Node;
public class Stack {

	Node top;
	Node node;
	int height;

	public Stack() {

	}

	public Stack(final int value) {
		node = new Node(value);
		top = node;
		height = 1;
	}

	public void printStack() {
		if (height == 0) {
			System.out.println("Stack is empty");
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.println(temp.getValue());
				temp = temp.getNext();
			}
		}
	}

	public void push(int value) {
		Node newNode = new Node(value);
		newNode.setNext(top);
		top = newNode;
		height++;
	}

	public Node pop() {
		if (height == 0) {
			System.out.println("Stack is empty");
			return null;
		}
		Node temp = top;
		top = temp.getNext();
		temp.setNext(null);
		System.out.println("Popped Node: " + temp.getValue());
		height--;
		return temp;
	}

	public int getSize() {
		return height;
	}
}
