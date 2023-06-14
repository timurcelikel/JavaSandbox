package random;
import java.util.*;

public class Sandbox {

	public static void main(String[] args) {

		System.out.println("--------- Arrays ---------");

		String[] stringArray = {"hello", "world"};
		System.out.println("Arrays.toString() -- " + Arrays.toString(stringArray));
		String[][] strings = {{"hello", "hi"}, {"goodbye", "bye"}};
		for (int i = 0; i < strings.length; i++) {
			for (int k = 0; k < strings.length; k++) {
				System.out.println(strings[i][k]);
			}
		}

		List<String> myList = Arrays.asList("aloha", "hola");		// Is mutable, not resizeable
		myList.forEach(System.out::println);

		List<String> anotherList = List.of("merhaba", "selam");		// Not mutable, not resizeable
		anotherList.forEach(System.out::println);

		System.out.println("--------- StringBuilder ---------");
		StringBuilder myString = new StringBuilder("hello");
		System.out.println(myString);
		myString.append(" world");
		System.out.println(myString);

		System.out.println("--------- Lists ---------");
		List<String> myList2 = new ArrayList<>(List.of("hello", "world"));
		myList2.add("again");
		System.out.println(myList2);
		myList2.forEach(System.out::println);

		System.out.println("--------- Maps ---------");
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Hello");
		myMap.put(2, "World");
		System.out.println(myMap);
		myMap.put(1, "My");
		System.out.println(myMap);
		myMap.keySet().forEach(System.out::println);
		myMap.values().forEach(System.out::println);
		myMap.entrySet().forEach(System.out::println);

		for (Map.Entry<Integer, String> mySet : myMap.entrySet()) {
			System.out.println(mySet.getKey());
			System.out.println(mySet.getValue());
		}
	}
}
