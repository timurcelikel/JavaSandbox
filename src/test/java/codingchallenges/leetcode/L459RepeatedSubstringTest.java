package codingchallenges.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class L459RepeatedSubstringTest {

	@Test
	public void test_repeatedSubstringPattern0() {

		final boolean actual = L459RepeatedSubstring.repeatedSubstringPattern0("abcabcabcabc");
		Assert.assertTrue(actual);
	}

	@Test
	public void test_repeatedSubstringPattern02() {

		final boolean actual = L459RepeatedSubstring.repeatedSubstringPattern0("abcabcabcabcd");
		Assert.assertFalse(actual);
	}

	@Test
	public void test_repeatedSubstringPattern03() {

		final boolean actual = L459RepeatedSubstring.repeatedSubstringPattern0(null);
		Assert.assertFalse(actual);
	}

	@Test
	public void test_repeatedSubstringPattern04() {

		final boolean actual = L459RepeatedSubstring.repeatedSubstringPattern0("-1-1");
		Assert.assertTrue(actual);
	}

}
