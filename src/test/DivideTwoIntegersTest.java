package test;
import static org.junit.Assert.*;
import javacode.DivideTwoIntegers;

import org.junit.Test;


public class DivideTwoIntegersTest {

	@Test
	public void test() {
		DivideTwoIntegers dti = new DivideTwoIntegers();
		int expected = 2147483647;
		int actual = dti.divide(2147483647, 1);
		assertEquals(expected, actual);
	}

}
