package datastructures.packt.tree;

public class BinaryTreeRunner {

	public static void main(String[] args) {
		Node<String> root = new Node<>("A");
		Node<String> b = new Node<>("B");
		Node<String> c = new Node<>("C");
		root.setLeftChild(b);
		root.setRightChild(c);
		breadthFirstTraversal(root);
	}

	public static void breadthFirstTraversal(final Node rootNode) {

		System.out.println(rootNode.getData() + " left child is " + rootNode.getLeftChild().getData());
		System.out.println(rootNode.getData() + " right child is " + rootNode.getRightChild().getData());
	}
}
