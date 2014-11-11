package test;
import static org.junit.Assert.*;
import javacode.FirstMissingPositive;

import org.junit.Test;


public class FirstMissingPositiveTest {

	@Test
	public void test() {
		FirstMissingPositive fmp = new FirstMissingPositive();
		int[] A = {2,3};
		int expected = 1;
		int actual = fmp.firstMissingPositive(A);
		assertEquals(expected, actual);
	}

}
