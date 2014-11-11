package test;
import static org.junit.Assert.*;
import javacode.Sqrt;

import org.junit.Test;


public class SqrtTest {

	@Test
	public void test() {
		Sqrt s = new Sqrt();
		int expected = 9999;
		int actual = s.sqrt(99980001);
		assertEquals(expected, actual);
	}

}
