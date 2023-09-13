package codingchallenges;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOddLengthStringsTest {

	@Test
	public void test_reverseOdd1() {

		final String testString = "Bananas";
		final String actualString = ReverseOddLengthStrings.reverseOdd(testString);
		final String expectedString = "sananaB";
		Assert.assertEquals(expectedString, actualString);
	}

	@Test
	public void test_reverseOdd2() {

		final String testString = "One two three four";
		final String actualString = ReverseOddLengthStrings.reverseOdd(testString);
		final String expectedString = "enO owt eerht four";
		Assert.assertEquals(expectedString, actualString);
	}

	@Test
	public void test_reverseOdd3() {

		final String testString = "Make sure uoy only esrever sdrow of ddo length";
		final String actualString = ReverseOddLengthStrings.reverseOdd(testString);
		final String expectedString = "Make sure you only reverse words of odd length";
		Assert.assertEquals(expectedString, actualString);
	}

	@Test
	public void test_reverseOdd4() {

		final String testString = null;
		final String actualString = ReverseOddLengthStrings.reverseOdd(testString);
		final String expectedString = null;
		Assert.assertNull(expectedString);
	}

}
