package java17.generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalPrinterClient {

	public static void main(String[] args) {

		AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(new Dog("bark"));
		dogPrinter.print();

		AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat("meow"));
		catPrinter.print();

		shout("yell");
		shout(23);

		List<Integer> intList = new ArrayList<>();
		intList.add(36);
		intList.add(45);
		printList(intList);

		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat("meow"));
		catList.add(new Cat("meeeeow"));
		printAnimalList(catList);
	}

	private static <T> void shout(T thingToShout) {

		System.out.println(thingToShout + "!!!");
	}

	private static void printList(List<?> list) {

		//list.forEach(p -> System.out.println(p));
		list.forEach(System.out::println);
	}

	private static void printAnimalList(List<? extends Animal> list) {

		//list.forEach(p -> p.makeNoise());
		list.forEach(Animal::makeNoise);
	}
}
