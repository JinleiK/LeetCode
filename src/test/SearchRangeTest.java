package test;
import static org.junit.Assert.*;
import javacode.SearchRange;

import org.junit.Test;


public class SearchRangeTest {

	@Test
	public void test() {
		SearchRange sr = new SearchRange();
		int[] A = {5,7,8,8,8,10};
		int target = 8;
		int[] expected = {2,4};
		int[] actual = sr.searchRange(A, target);
		assertEquals(expected[1], actual[1]);
	}

}
