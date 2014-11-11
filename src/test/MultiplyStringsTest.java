package test;
import static org.junit.Assert.*;
import javacode.MultiplyStrings;

import org.junit.Test;


public class MultiplyStringsTest {

	@Test
	public void test() {
		MultiplyStrings ms = new MultiplyStrings();
		String num1 = "";
		String num2 = "";
		String expected = "";
		String actual = ms.multiply(num1, num2);
		assertEquals(expected, actual);
	}

}
