package codingchallenges.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class L27RemoveElementTest {

	@Test
	void test_betterRemoveElement() {

		int[] array = new int[] { 3, 2, 2, 3 };
		int valueToRemove = 3;
		int actualCount = L27RemoveElement.betterRemoveElement(array, valueToRemove);
		int expectedCount = 2;
		Assertions.assertEquals(expectedCount, actualCount);
	}
}