package codingchallenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L3LongestSubstringWithoutRepeating {

	public static void main(String[] args) {

		//String s = "abcabcbb";
		//String s = "bbbbb";
		String s = "pwwkew";
		int result = lengthOfLongestSubstring(s);
		System.out.println("Output: " + result);
	}

	public static int lengthOfLongestSubstring(String s) {

		// Iterate over i building substrings until a character is repeated. Figure out whatever that highest value is.
		int highestNonRepeatingCount = 0;
		for (int i = 0; i < s.length(); i++) {
			List<Character> charList = new ArrayList<>();
			int loopNonRepeatingCount = 0;
			for (int k = i; k < s.length(); k++) {
				char currentChar = s.charAt(k);
				if (charList.contains(currentChar)) {
					break;
				} else {
					charList.add(currentChar);
					loopNonRepeatingCount++;
				}
			}
			if (loopNonRepeatingCount > highestNonRepeatingCount) {
				highestNonRepeatingCount = loopNonRepeatingCount;
			}
		}
		return highestNonRepeatingCount;
	}
}
