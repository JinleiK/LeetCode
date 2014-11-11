package test;
import static org.junit.Assert.*;
import javacode.DecodeWays;

import org.junit.Test;


public class DecodeWaysTest {

	@Test
	public void test() {
		DecodeWays dw = new DecodeWays();
		int expected = 0;
		int actual = dw.numDecodings("012");
		assertEquals(expected, actual);
	}

}
