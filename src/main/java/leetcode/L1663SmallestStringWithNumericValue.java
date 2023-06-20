package leetcode;

public class L1663SmallestStringWithNumericValue {



	public static void main(String[] args) {

		// Input: n = 3, k = 27
		// Output: "aay"

		// Input: n = 5, k = 73
		// Output: "aaszz"

		int n = 3;
		int k = 27;
		String result = getSmallestString(n, k);
		System.out.println("Output: " + result);
	}

	public static String getSmallestString(int n, int k) {

		StringBuilder smallestString = new StringBuilder();
		// Ideas: Iterate over n and find the appropriate letter for each spot.
		while (n > 0) {
			int currentValue = k - n + 1;
			int division = currentValue / 26;
			if (division >= 1) {
				smallestString.append("z");
				k = k - 26;
			} else if (k == n) {
				smallestString.append("a");
				k--;
			} else {
				char value = (char) (currentValue - 1 + 'a');
				smallestString.append(value);
				k = k - currentValue;
			}
			n = n - 1;
		}

		return smallestString.reverse().toString();
	}
}
