package codingchallenges;

public class SSAndCInterview {

	public static void main(String[] args) {

		String example1 = reverseOdd("Bananas");
		System.out.println(example1);

		String example2 = reverseOdd("One two three four");
		System.out.println(example2);

		String example3 = reverseOdd("Make sure uoy only esrever sdrow of ddo length");
		System.out.println(example3);
	}

	public static String reverseOdd(String str) {

		String[] words = str.split(" ");
		//System.out.println(Arrays.toString(words));
		StringBuilder sb1 = new StringBuilder();
		for (String word : words) {
			StringBuilder sb = new StringBuilder();
			if (word.length() % 2 != 0) {
				sb.append(word);
				sb1.append(sb.reverse().toString()).append(" ");
			} else {
				sb1.append(word).append(" ");
			}
		}
		return sb1.toString();
	}
}
