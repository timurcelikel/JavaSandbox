package java17.generics;

public class AnimalPrinterClient {

	public static void main(String[] args) {

		AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(new Dog());
		dogPrinter.print();

		AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat());
		catPrinter.print();
	}
}
