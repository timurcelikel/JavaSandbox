package datastructures.packt.tree;

public class Node<T> {

	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;

	public Node(T data) {

		this.data = data;
	}

	public T getData() {

		return data;
	}
	public static <T> void breadthFirst(final Node<T> root) {
		if (root == null) {
			return;
		}



	}


	public void setData(final T data) {

		this.data = data;
	}

	public Node<T> getLeftChild() {

		return leftChild;
	}

	public void setLeftChild(final Node<T> leftChild) {

		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {

		return rightChild;
	}

	public void setRightChild(final Node<T> rightChild) {

		this.rightChild = rightChild;
	}
}
