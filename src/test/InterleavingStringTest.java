package test;

import static org.junit.Assert.*;
import javacode.InterleavingString;

import org.junit.Test;

public class InterleavingStringTest {

	@Test
	public void test1() {
		InterleavingString is = new InterleavingString();
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcac";
		boolean expected = true;
		boolean actual = is.isInterleave(s1, s2, s3);
		assertEquals(expected, actual);
	}
	@Test
	public void testdp() {
		InterleavingString is = new InterleavingString();
		String s1 = "a";
		String s2 = "b";
		String s3 = "ab";
		boolean expected = true;
		boolean actual = is.isInterleaveDP(s1, s2, s3);
		assertEquals(expected, actual);
	}

}
