package test;

import static org.junit.Assert.*;
import javacode.StringToInteger;

import org.junit.Test;

public class StringToIntegerTest {

	@Test
	public void test() {
		StringToInteger atoi = new StringToInteger();
		int expected = 2147483647;
		int actual = atoi.atoi("9223372036854775809");
		assertEquals(expected, actual);
	}

}
