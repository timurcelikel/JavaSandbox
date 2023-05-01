package java17.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsClient {

	public static void main(String[] args) {

		List<Number> myList = new ArrayList<>();
		myList.add(10);
		myList.add(23);
		m1(myList);

		List<String> myList2 = new ArrayList<>();
		myList2.add("durga");
		m2(myList2);
	}

	private static void m1(List<? super Number> list) {

		list.add(Integer.valueOf(10));
		list.add(Double.valueOf(10.5));
		list.forEach(System.out::println);
	}

	// Extends does not work here for some reason
	// private static void m1(List<? extends String> list) {
	private static void m2(List<? super String> list) {

		list.add("myString");
		list.forEach(System.out::println);
	}
}
