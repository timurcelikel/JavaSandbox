package datastructures.packt.tree;

public class NodeQueue<T> {

	private T data;
	private Node<T> first;
	private Node<T> last;

	public NodeQueue() {}

	public NodeQueue(T data) {
		this.data = data;
	}

	public T getData() {

		return data;
	}

	public void enqueue(final Node newNode) {
		Node temp = last;
		//last.next = newNode;


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
