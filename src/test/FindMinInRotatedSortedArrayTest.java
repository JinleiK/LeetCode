package test;
import static org.junit.Assert.*;
import javacode.FindMinInRotatedSortedArray;

import org.junit.Test;


public class FindMinInRotatedSortedArrayTest {

	@Test
	public void test() {
		FindMinInRotatedSortedArray ff = new FindMinInRotatedSortedArray();
		int[] a = {3,3,3,3,3,3,3,3,1,3,3};
		int expected = 1;
		int actual = ff.findMinDup(a);
		assertEquals(expected, actual);
	}

}
