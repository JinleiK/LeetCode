package test;
import static org.junit.Assert.*;

import java.RemoveDup;

import org.junit.Test;


public class RemoveDupTest {

	@Test
	public void test() {
		RemoveDup rd = new RemoveDup();
		int[] A = {1,2,3,3,3,3,4,4};
		int expected = 6;
		int actual = rd.removeDuplicates(A);
		assertEquals(expected, actual);
		
		int[] B = {0,0,1,1,1,2,3,3,3,4,4};
		int expectB = 3;
		int actualB = rd.removeDuplicates(B);
		assertEquals(expectB, B[5]);
	}

}
