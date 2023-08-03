package codingchallenges;

import java.util.*;

public class ArraySandbox {

	public static void main(String[] args) {
		int[] intArray = {5, 3, 2, 1, 4};
		Integer maxValue = Arrays.stream(intArray).boxed().max(Comparator.naturalOrder()).get();
		List<Integer> intList = Arrays.stream(intArray).boxed().toList();
		System.out.println("maxValue: " + maxValue);
		System.out.println("intList: " + intList.toString());
		Arrays.sort(intArray);
		System.out.println("sorted intArray: " + Arrays.toString(intArray));

		List<Integer> intList2 = new ArrayList<>(Arrays.asList(4, 3, 5, 1, 2));
		Collections.sort(intList2);
		System.out.println("intList2: " + intList2.toString());
		int[] intArray2 = intList2.stream().mapToInt(i -> i).toArray();
		System.out.println("intArray2: " + Arrays.toString(intArray2));

		char[] charArray = {'a','d','e','b','c'};
		StringBuilder charString = new StringBuilder();
		Arrays.sort(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("c: " + charArray[i]);
			charString.append(charArray[i]);
		}
		System.out.println("charString: " + charString);
		System.out.println("char at 2: " + charString.charAt(2));
		String[] stringArray = charString.toString().split("c");
		System.out.println("stringArray: " + Arrays.toString(stringArray));;

		String testString = "hello world!";
		char[] testArray = testString.toCharArray();
		System.out.println("testArray: " + Arrays.toString(testArray));
	}
}
