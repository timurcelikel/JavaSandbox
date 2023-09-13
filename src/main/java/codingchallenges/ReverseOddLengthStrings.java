package codingchallenges;

import org.apache.commons.lang3.StringUtils;

public class ReverseOddLengthStrings {

	public static void main(String[] args) {

		String example1 = reverseOdd("Bananas");
		System.out.println(example1);

		String example2 = reverseOdd("One two three four");
		System.out.println(example2);

		String example3 = reverseOdd("Make sure uoy only esrever sdrow of ddo length");
		System.out.println(example3);
	}

	public static String reverseOdd(final String originalString) {

		if (StringUtils.isEmpty(originalString)) {
			return null;
		}
		String[] words = originalString.split(" ");
		StringBuilder newString = new StringBuilder();
		for (String word : words) {
			if (word.length() % 2 != 0) {
				// reverse if odd
				StringBuilder reversedString = new StringBuilder(word).reverse();
				newString.append(reversedString).append(" ");

			} else {
				// don't reverse
				newString.append(word).append(" ");
			}
		}
		return newString.toString().trim();
	}
}
