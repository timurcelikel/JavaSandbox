package codingchallenges;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class CenteneInterview {

	public static void main(String[] args) {

		// The goal was to take a string of numbers and sort them and de-dupe them and return something like:
		// 1 2 3 4 5 6 7 8 9 10
		String numbers = "1 10 2 8 7 3 6 9 4 1 7 5";
		//String sortedString = sortAndDedupe(numbers);
		String sortedString = streamSortAndDedupe(numbers);
		System.out.println(sortedString);
	}
	private static String streamSortAndDedupe(final String numbers) {
		// Convert each split string value to an integer value for distinct and sort. Then convert these values back to a formatted string
		return Arrays.stream(numbers.split(" ")).map(Integer::valueOf).distinct().sorted().map(String::valueOf).collect(Collectors.joining(" "));
	}
	private static String sortAndDedupe(final String numbers) {
		String[] array = numbers.split(" ");
		System.out.println(Arrays.toString(array));
		List<Integer> intValues = new ArrayList<>();
		for (String value : array) {
			Integer numericValue = Integer.parseInt(value);
			if (!intValues.contains(numericValue)) {
				intValues.add(numericValue);
			}
		}
		Collections.sort(intValues);
		StringBuilder outputString = new StringBuilder();
		for (Integer intValue : intValues) {
			outputString.append(intValue);
			outputString.append(" ");
		}
		return outputString.toString().trim();
	}
}
