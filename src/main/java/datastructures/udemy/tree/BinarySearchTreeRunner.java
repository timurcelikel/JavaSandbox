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

		bst.contains(10);
		bst.contains(8);
		bst.contains(88);

		/*
		System.out.println("--- Now do it recursively ---");
		BinarySearchTree bst2 = new BinarySearchTree();
		Node head = new Node(10);
		bst2.insertRecursively(head, new Node(11));
		bst2.insertRecursively(head, new Node(8));
		bst2.insertRecursively(head, new Node(5));
		bst2.insertRecursively(head, new Node(5));
		*/
	}
}
