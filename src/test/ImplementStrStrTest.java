package test;
import static org.junit.Assert.*;
import javacode.ImplementStrStr;

import org.junit.Test;


public class ImplementStrStrTest {

	@Test
	public void test() {
		ImplementStrStr irr = new ImplementStrStr();
		String expected = null;
		String actual = irr.strStr("acaea", "ab");
		assertEquals(expected, actual);
	}

}
