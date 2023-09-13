package codingchallenges.leetcode;

public class L459RepeatedSubstring {

	public static void main(String[] args) {
		//String s = "abab";
		//String s = "aba";
		String s = "abcabcabcabc";
		System.out.println(repeatedSubstringPattern0(s));
	}

	public static boolean repeatedSubstringPattern0(String s) {

		// One solution could be finding the number of abc in a .contains and seeing if the whole rest of the string is abc based on the length of
		// abc and the string length

		// Another solution: can we take ab and fill out the remainder of the string up to the original string's length with ab and then determine
		// if those strings are equal?
		if (s != null) {
			StringBuilder substring = new StringBuilder();
			int subStringLength = 0;
			for (int i = 0; i < s.length(); i++) {
				substring.append(s.charAt(i));
				subStringLength++;
				if (s.length() != subStringLength && s.length() % subStringLength == 0) {
					int division = s.length() / subStringLength;
					StringBuilder stringToCompare = new StringBuilder();
					for (int k = 0; k < division; k++) {
						stringToCompare.append(substring);
					}
					if (s.contentEquals(stringToCompare)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean repeatedSubstringPattern(String s) {
		// Maybe iterate over each substring and split the original string by this substring and then determine if each of the array elements are
		// equal to each other after the split?
		//char[] characters = s.toCharArray();
		// This one passes all tests but Leetcode didn't accept it because it took too much time to process
		StringBuilder test = new StringBuilder();
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.split(test.toString()).length == 0) {
				return true;
			}
			test.append(s.charAt(i));
		}
		return false;
	}

	public static boolean repeatedSubstringPattern2(String s) {

		int len = s.length();
		for (int i = len / 2; i >= 1; i--) {
			if (len % i == 0) {
				int num_repeats = len / i;
				String substring = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < num_repeats; j++) {
					sb.append(substring);
				}
				if (sb.toString().equals(s))
					return true;
			}
		}
		return false;
	}
}


