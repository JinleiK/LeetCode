package test;

import static org.junit.Assert.*;
import javacode.MaximumSubarray;

import org.junit.Test;

public class MaximumSubarrayTest {

	@Test
	public void test() {
		MaximumSubarray ms = new MaximumSubarray();
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		int expected = 6;
		int actual = ms.maxSubArrayDC(A);
		assertEquals(expected, actual);
	}

}
