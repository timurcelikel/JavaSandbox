package java17;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsSandbox {

	public static void main(String[] args) {

		// FILTER
		List<Integer> numList = Arrays.asList(10,15,20,25,30);

		List<Integer> evenNumbers = numList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theater");
		List<String> nonNullWords = words.stream().filter(w -> w != null).collect(Collectors.toList());
		System.out.println(nonNullWords);

		// MAP
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "plane", "train");
		List<String> upperCaseVehicles = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseVehicles);
		vehicles.stream().map(vname -> vname.length()).forEach(System.out::println);

		List<Integer> numbersList = Arrays.asList(2,3,4,5);
		List<Integer> multipliedList = numbersList.stream().map(n -> n * 3).collect(Collectors.toList());
		System.out.println(multipliedList);

		// FLATMAP
		List<Integer> l1 = Arrays.asList(1,2);
		List<Integer> l2 = Arrays.asList(3,4);
		List<Integer> l3 = Arrays.asList(5,6);
		List<List<Integer>> myList = Arrays.asList(l1, l2, l3);
		List<Integer> finalResults = myList.stream()
				.flatMap(x -> x.stream().map(n -> n + 10))
				.collect(Collectors.toList());		// 11, 12, 13, 14, 15, 16
		System.out.println(finalResults);

		// DISTINCT, COUNT, LIMIT
		List<String> vehicles2 = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");

		// distinct
		List<String> uniqueVehicles = vehicles2.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueVehicles); 		// Prints: bus, car, bicycle, bike

		// count
		long count = vehicles2.stream().distinct().count(); 		// Should give 4
		System.out.println(count);

		// limit
		vehicles2.stream().limit(3).forEach(System.out::println); 		// Prints: bus, car, bicycle

		// MIN and MAX
		List<Integer> numbersList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// count the even numbers
		long evenCount = numbersList2.stream().filter(n -> n % 2 == 0).count();

		// min
		Optional<Integer> min = numbersList2.stream().min(Integer::compareTo);
		// or without method reference
		// Optional<Integer> min = numbersList2.stream().min((v1, v2) -> v1.compareTo(v2));
		System.out.println(min.get()); 		// Prints: 1

		// max
		Optional<Integer> max = numbersList2.stream().max(Integer::compareTo);
		System.out.println(max.get()); 		// Prints: 10

		// REDUCE
		List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
		String reduced = stringList.stream().reduce("", (value, combinedValue) -> value + combinedValue);
		System.out.println(reduced); 		// Prints: ABC123

		List<Integer> numbersList3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = numbersList3.stream().reduce(0, Integer::sum);
		// or without method reference
		// int sum = numbersList3.stream().reduce(0, (subtotal, element) -> subtotal + element);
		System.out.println(sum); 		// Prints: 55

		// TO ARRAY
		String[] array = stringList.toArray(String[]::new);
		// technically we don't even need to use a stream but here it is with one
		//String[] array = stringList2.stream().toArray(String[] :: new);
		System.out.println(Arrays.toString(array));

		// SORTED
		List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 2, 5);
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList); 		// Prints: 1, 2, 3, 4, 5, 7, 9
		long distinctCount = list1.stream().distinct().count();
		if (list1.stream().distinct().count() < list1.size()) {
			System.out.println("Duplicates Found");
		}
		System.out.println("Distinct Count: " + distinctCount);

		List<Integer> descendingList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingList); 		// Prints: 9, 7, 5, 4, 3, 2, 1

		// ANYMATCH, ALLMATCH, NONEMATCH
		Set<String> fruits = new HashSet<>();
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("Three grapes");
		fruits.add("Two guavas");

		boolean result = fruits.stream().anyMatch(value -> value.startsWith("One"));		// returns true
		System.out.println(result);

		boolean result2 = fruits.stream().allMatch(value -> value.startsWith("One"));		// returns false
		System.out.println(result2);

		boolean result3 = fruits.stream().noneMatch(value -> value.startsWith("One"));		// returns false
		System.out.println(result3);

		// FIND ANY, FIND FIRST
		List<String> stringList2 = Arrays.asList("one", "two", "three", "one");

		Optional<String> element = stringList2.stream().findAny();
		System.out.println(element.get()); 		// returns one, but not guaranteed

		Optional<String> element2 = stringList2.stream().findFirst();
		System.out.println(element.get()); 		// returns one always

		// PARALLEL STREAMS
		class Student {
			String name;
			int score;

			public Student(String name, int score) {
				this.name = name;
				this.score = score;
			}

			public String getName() {
				return name;
			}

			public int getScore(){
				return score;
			}
		}

		List<Student> studentList = Arrays.asList(
				new Student("David", 82),
				new Student("Bob", 90),
				new Student("John", 65),
				new Student("Canedy", 55),
				new Student("Eric", 85),
				new Student("Smith", 88),
				new Student("Scott", 50));

		// Normal sequential stream
		studentList.stream().filter(s -> s.getScore() >= 80).limit(3).forEach(st -> System.out.println(st.getName() + " " + st.getScore()));

		// Parallel stream
		studentList.parallelStream().filter(s -> s.getScore() >= 80).limit(3).forEach(st -> System.out.println(st.getName() + " " + st.getScore()));

		// Convert normal stream to Parallel stream
		studentList.stream().parallel().filter(s -> s.getScore() >= 80).limit(3).forEach(st -> System.out.println(st.getName() + " " + st.getScore()));
	}
}
