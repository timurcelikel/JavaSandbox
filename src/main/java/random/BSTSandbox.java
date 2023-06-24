package random;

public class BSTSandbox {

	public static void main(String[] args) {

		BSTree bst = new BSTree(10);
		bst.insert(11, bst.root);
		bst.insert(7, bst.root);
		bst.insert(5, bst.root);
		bst.printTree(bst.root);
	}
}

class BSTree {

	TreeNode root;

	public BSTree(int value) {
		root = new TreeNode(value);
	}

	public TreeNode insert(final int value, TreeNode head) {

		if (head == null) {
			head = new TreeNode(value);
		} else {
			if (head.value == value) {
				System.out.println("Duplicate found");
				return null;
			} else if (value < head.value) {
				head.left = insert(value, head.left);
			} else {
				head.right = insert(value, head.right);
			}
		}
		return head;
	}

	public void printTree(TreeNode head) {
		if (head == null) {
			return;
		}
		System.out.println(head.value);
		printTree(head.left);
		printTree(head.right);
	}
}

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}
}