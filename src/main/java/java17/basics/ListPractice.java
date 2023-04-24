package java17.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {

		List<String> fruits = List.of("apples", "bananas", "strawberries", "watermelons");
		//fruits.add("berries"); 		// ImmutableCollection - not allowed
		//fruits.remove("apples"); 		// also not allowed

		List<String> fruits2 = Arrays.asList("apples", "bananas", "strawberries", "watermelons");
		//fruits2.remove("apples");	// not allowed

		List<String> fruitList = new ArrayList<>(fruits);
		fruitList.add("berries");
		fruitList.sort(Comparator.naturalOrder());
		System.out.println(fruitList);

		fruitList.remove(1);
		fruitList.remove("strawberries");
		System.out.println(fruitList);            // Prints [apples, watermelons, berries]
	}
}
