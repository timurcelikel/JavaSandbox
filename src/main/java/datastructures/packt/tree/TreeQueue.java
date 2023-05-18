package datastructures.packt.tree;

public class TreeQueue <T> {

	private T data;
	private Node<T> first;
	private Node<T> last;

	private int length = 0;

	public TreeQueue () {}



	public T getData() {

		return data;
	}

	public void breadthFirstTraversal(final Node rootNode) {

		if (rootNode == null) {
			return;
		}

		TreeQueue<T> queue = new TreeQueue<T>();
		queue.enqueue(rootNode);

		System.out.println(rootNode.getData() + " left child is " + rootNode.getLeftChild().getData());
		System.out.println(rootNode.getData() + " right child is " + rootNode.getRightChild().getData());
	}


	public void enqueue(final Node newNode) {
		if (length == 0) {
			first = newNode;
			last = newNode;
			length++;
		} else {
			// Add new node to the end of the queue
			//last.next = newNode;
			last = newNode;
			if (first.getLeftChild() != null) {

			}
		}
	}

	public void setData(final T data) {

		this.data = data;
	}

	public Node<T> getFirst() {

		return first;
	}

	public void setFirst(final Node<T> first) {

		this.first = first;
	}

	public Node<T> getLast() {

		return last;
	}

	public void setLast(final Node<T> last) {

		this.last = last;
	}
}
