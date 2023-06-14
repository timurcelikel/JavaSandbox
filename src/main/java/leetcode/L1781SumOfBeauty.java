package leetcode;

import java.util.*;

public class L1781SumOfBeauty {

	// aabcb
	// aab, aabc, aabcb, abcb, bcb
	// Output = 5

	public static void main(String[] args) {

		String s = "aabcbaa";
		//String s = "aabcb";
		int count = beautySum(s);
		System.out.println(count);
	}

	public static int beautySum(String s) {
		int totalSum = 0;
		for (int i = 0; i < s.length(); i++) {
			Map<Character, Integer> map = new HashMap<>();
			for (int k = i; k < s.length(); k++) {
				char j = s.charAt(k);
				if (map.get(j) != null) {
					int count = map.get(j);
					count = count + 1;
					map.put(j, count);
				} else {
					map.put(j, 1);
				}

				int minFrequent = Integer.MAX_VALUE;
				int maxFrequent = 0;

				for (Integer value : map.values()) {
					if (value > maxFrequent) {
						maxFrequent = value;
					}
					if (value < minFrequent) {
						minFrequent = value;
					}
				}

				// Determine if we have a delta of at least 1 and need to add this to the total sum
				int delta = maxFrequent - minFrequent;
				if (map.size() > 1 && delta > 0) {
					totalSum = totalSum + delta;
				}
			}
		}

		return totalSum;
	}
}
