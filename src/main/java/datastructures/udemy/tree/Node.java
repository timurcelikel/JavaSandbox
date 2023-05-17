package datastructures.udemy.tree;

public class Node {

	private int data;
	private Node leftChild;
	private Node rightChild;

	public Node(int data) {

		this.data = data;
	}
	public void breadthFirst(final Node root) {
		if (root == null) {
			return;
		}
	}
	public int getData() {

		return data;
	}
	public void setData(final int data) {

		this.data = data;
	}

	public Node getLeftChild() {

		return leftChild;
	}

	public void setLeftChild(final Node leftChild) {

		this.leftChild = leftChild;
	}

	public Node getRightChild() {

		return rightChild;
	}

	public void setRightChild(final Node rightChild) {

		this.rightChild = rightChild;
	}
}
