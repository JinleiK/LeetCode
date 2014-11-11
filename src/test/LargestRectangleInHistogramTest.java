package test;

import static org.junit.Assert.*;
import javacode.LargestRectangleInHistogram;

import org.junit.Test;

public class LargestRectangleInHistogramTest {

	@Test
	public void test() {
		LargestRectangleInHistogram lrh = new LargestRectangleInHistogram();
		int[] h = {2,1,5,6,2,3};
		int[] h1 = {0,1,2,3,4,5};
		int expected = 9;
		int actual = lrh.largestRectangleArea(h1);
		assertEquals(expected, actual);
	}

}
