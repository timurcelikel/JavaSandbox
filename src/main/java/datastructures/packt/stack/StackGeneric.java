package datastructures.packt.stack;

public class StackGeneric<T> {

	Element<T> top;

	int height = 0;

	public StackGeneric(T value) {
		top = new Element<>(value);
		height = 1;
	}

	public void printStack() {
		Element<T> temp = top;
		for (int i = 0; i < height; i++) {
			System.out.println(temp.value);
			if (temp.next != null) {
				temp = temp.next;
			}
		}
	}

	public void push(T value) {
		Element<T> newElement = new Element<>(value);
		newElement.next = top;
		top = newElement;
		height++;
	}

	public Element<T> pop() {
		Element<T> temp = top;		// reference on Java Stack points to top address
		top = top.next;				// reference of top now points to top.next
		temp.next = null;
		height--;
		return temp;
	}

	public Element<T> peek() {
		return top;
	}
}
