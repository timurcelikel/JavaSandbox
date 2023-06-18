package datastructures.udemy.tree;
public class BinarySearchTreeRunner {
	public static void main(String[] args) {
		System.out.println("--- Insert tree nodes with a while loop ---");
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(new Node(10));
		bst.insert(new Node(11));
		bst.insert(new Node(8));
		bst.insert(new Node(5));
		bst.insert(new Node(5));
		bst.insert(new Node(6));

		bst.contains(10);
		bst.contains(1);

		System.out.println("BST Contents:");
		bst.printTree(bst.getRoot());
	}
}
