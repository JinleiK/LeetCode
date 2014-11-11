package test;
import static org.junit.Assert.*;
import javacode.LongestPalindromicSubstring;

import org.junit.Test;


public class LongestPalindromicSubstringTest {

	@Test
	public void test() {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		String s = "aabac";
		String expected = "aba";
		String actual = lps.longestPalindrome(s);
		assertEquals(expected, actual);
	}

}
