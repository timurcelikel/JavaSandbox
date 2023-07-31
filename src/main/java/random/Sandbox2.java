package random;

import java.util.*;

public class Sandbox2 {

	public static void main(String[] args) {
		Integer[] array = { 6, 1, 5, 4, 3, 2 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		List<Integer> list = Arrays.asList(array);
		list.stream().forEach(System.out::println);
		Integer[] newArray = list.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(newArray));

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

		String hello = "helll0 wor1d";
		char[] charArray = hello.toCharArray();
		List<Character> charList = new ArrayList<>();
		Map<Character, Integer> charFreq = new HashMap<>();
		for (char letter : charArray) {
			if (charFreq.get(letter) != null) {
				charFreq.put(letter, charFreq.get(letter) + 1);
			} else {
				charFreq.put(letter, 1);
			}
			if (Character.isLetter(letter)) {
				charList.add(letter);
			}
		}
		System.out.println(charList);
		System.out.println(charFreq);
	}
}
