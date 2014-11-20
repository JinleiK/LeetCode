package test;
import static org.junit.Assert.*;
import javacode.ValidNumber;

import org.junit.Test;

public class ValidNumberTest {

	@Test
	public void test() {
		ValidNumber vn = new ValidNumber();
		boolean expected = true;
		boolean actual = vn.isNumber2("-1.");
		assertEquals(expected, actual);
	}

}
