package datastructures.packt.stack;

public class Element<T> {

	T value;

	Element<T> next;

	public Element(final T value) {
		this.value = value;
		next = null;
	}
}
