package java17.generics;

public class Calculator<T extends Number> {

	T number1, number2;

	public Calculator(final T number1, final T number2) {

		this.number1 = number1;
		this.number2 = number2;
	}

	public void add(T n1, T n2) {

		// Example from Durga: this doesn't work - Number doesn't have math operations
		//System.out.println(n1 + n2);
	}
}
