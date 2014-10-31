package test;
import static org.junit.Assert.*;

import java.SearchInRotated;

import org.junit.Test;


public class SearchInRotatedTest {

	@Test
	public void test() {
		SearchInRotated sr = new SearchInRotated();
		int[] A = {1,1,1,0,0,0};
		int target = 4;
		int expected = -1;
		int actual = sr.search(A, target);
		assertEquals(expected, actual);
		
		int[] B = {3,1};
		int targetB = 1;
		boolean expectedB = true;
		boolean actualB = sr.search2(B, targetB);
		assertEquals(expectedB, actualB);
	}

}
