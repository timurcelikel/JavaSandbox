package datastructures.udemy.tree;
public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
	}

	public Node insertRecursively(Node head, Node node) {
		if (head == null) {
			System.out.println(node.getData() + " added as root node");
			return node;
		}
		if (node.getData() == head.getData()) {
			System.out.println("Value is a duplicate");
			return null;
		}
		if (node.getData() < head.getData()) {
			head.setLeftChild(insertRecursively(head.getLeftChild(), node));
			System.out.println(node.getData() + " added as left child to " + head.getData());
		} else {
			head.setRightChild(insertRecursively(head.getRightChild(), node));
			System.out.println(node.getData() + " added as right child to " + head.getData());
		}
		return head;
	}

	public boolean insert(Node node) {
		Node temp = root;
		if (root == null) {
			System.out.println(node.getData() + " added as root node");
			root = node;
		} else {
			while (true) {
				if (node.getData() == temp.getData()) {
					System.out.println("Value is a duplicate");
					return false;
				}
				if (node.getData() <= (temp.getData())) {
					if (temp.getLeftChild() != null) {
						temp = temp.getLeftChild();
					} else {
						temp.setLeftChild(node);
						System.out.println(node.getData() + " added as left child to " + temp.getData());
						return true;
					}
				} else {
					if (temp.getRightChild() != null) {
						temp = temp.getRightChild();
					} else {
						temp.setRightChild(node);
						System.out.println(node.getData() + " added as right child to " + temp.getData());
						return true;
					}
				}
			}
		}
		return true;
	}

	public boolean contains(int value) {
		Node temp = root;
		while (temp != null) {
			if (temp.getData() == value) {
				System.out.println("Tree contains " + value);
				return true;
			} else if (value < temp.getData()) {
				temp = temp.getLeftChild();
			} else if (value > temp.getData()) {
				temp = temp.getRightChild();
			}
		}
		System.out.println("Tree does not contain " + value);
		return false;
	}

	public void printTree() {
		Node temp = root;
		System.out.println("Root is: " + root);
		while (true) {
			if (temp.getLeftChild() != null) {
				System.out.println(temp.getData() + " left child is " + temp.getLeftChild().getData());
			}
			if (temp.getRightChild() != null) {
				System.out.println(temp.getData() + " right child is " + temp.getRightChild().getData());
			}
			temp = temp.getLeftChild();
		}
	}
}
