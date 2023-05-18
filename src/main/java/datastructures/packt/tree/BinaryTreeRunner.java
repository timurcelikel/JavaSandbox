package datastructures.packt.tree;

public class BinaryTreeRunner {

	// I am aborting this effort for now. I started to realize that almost every example on the Internet uses Java's Queue and LinkedList
	// structures and it's not a great idea to try and create my own.
	public static void main(String[] args) {
		Node<String> root = new Node<>("A");
		Node<String> b = new Node<>("B");
		Node<String> c = new Node<>("C");
		root.setLeftChild(b);
		root.setRightChild(c);
		//breadthFirstTraversal(root);
	}



}
