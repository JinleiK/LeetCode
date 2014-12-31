package test;
import static org.junit.Assert.*;
import javacode.LongestPalindromicSubstring;

import org.junit.Test;


public class LongestPalindromicSubstringTest {

	@Test
	public void test() {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		String s = "bbb";
		String expected = "bbb";
		String actual = lps.longestPalindrome(s);
		assertEquals(expected, actual);
	}

}
