package test;
import static org.junit.Assert.*;

import java.MaximumProductSubarray;

import org.junit.Test;


public class MaximumProductSubarrayTest {

	@Test
	public void test() {
		MaximumProductSubarray mps = new MaximumProductSubarray();
		int[] A = {-2};
		int expected = -2;
		int actual = mps.maxProduct2(A);
		assertEquals(expected, actual);
	}

}
