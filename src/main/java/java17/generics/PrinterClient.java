package java17.generics;

public class PrinterClient {

	public static void main(String[] args) {

		Printer<Integer> integerPrinter = new Printer<>(23);
		integerPrinter.print();

		Printer<String> stringPrinter = new Printer<>("hello");
		stringPrinter.print();
	}
}
