package random;
import java.util.*;
import java.util.stream.Collectors;

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

		List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
		String reduced = stringList.stream().reduce("", (value, combinedValue) -> value + combinedValue);
		System.out.println(reduced); 		// Prints: ABC123

		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> min = numbersList.stream().min(Integer::compareTo);
		System.out.println(min.get());
		Optional<Integer> max = numbersList.stream().max((v1, v2) -> v1.compareTo(v2));
		System.out.println(max.get());

		int sum = numbersList.stream().reduce(0, Integer::sum);
		System.out.println(sum); 		// Prints: 55

		String[] array = stringList.toArray(String[]::new);
		String[] array2 = stringList.stream().toArray(String[] :: new);

		System.out.println(Arrays.toString(array));

		List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList); 		// Prints: 1, 2, 3, 4, 5, 7, 9

		// Sort in descending order
		List<Integer> descendingList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingList); 		// Prints: 9, 7, 5, 4, 3, 2, 1

		Set<String> fruits = new HashSet<>();
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("Three grapes");
		fruits.add("Two guavas");

		// If even one element starts with "One" we will get true here
		boolean result = fruits.stream().anyMatch(value -> {return value.startsWith("One");});		// returns true
		boolean result3 = fruits.stream().anyMatch(value -> value.startsWith("One"));		// returns true
		System.out.println(result3);
		// Every element must start with "one" to be true
		boolean result2 = fruits.stream().allMatch(value -> {return value.startsWith("One");});		// returns false
		System.out.println(result2);
		boolean result4 = fruits.stream().noneMatch(value -> value.startsWith("One"));		// returns false
		System.out.println(result4);
	}
}
