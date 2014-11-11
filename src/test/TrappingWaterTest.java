package test;
import static org.junit.Assert.*;
import javacode.TrappingWater;

import org.junit.Test;


public class TrappingWaterTest {

	@Test
	public void test() {
		TrappingWater tw = new TrappingWater();
		int[] A = {0,1,0,2,1,0,1,3,2,1,2,1};
		int expected = 6;
		int actual = tw.trap(A);
		assertEquals(expected, actual);
	}

}
