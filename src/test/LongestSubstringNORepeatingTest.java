package test;
import static org.junit.Assert.*;

import java.LongestSubstringNORepeating;

import org.junit.Test;


public class LongestSubstringNORepeatingTest {

	@Test
	public void test() {
		LongestSubstringNORepeating ls = new LongestSubstringNORepeating();
		String s = "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcac";
		int expected = 12;
		int actual = ls.lengthOfLongestSubstring2(s);
		assertEquals(expected, actual);
	}

}
