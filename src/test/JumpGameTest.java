package test;
import static org.junit.Assert.*;
import javacode.JumpGame;

import org.junit.Test;


public class JumpGameTest {

	@Test
	public void test() {
		JumpGame jg = new JumpGame();
		int[] A = {3,2,1,0,4};
		boolean expected = false;
		boolean actual = jg.canJump(A);
		assertEquals(expected, actual);
		
		int[] B = {2,3,1,1,4};
		int expectedB = 2;
		int actualB = jg.jump(B);
		assertEquals(expectedB, actualB);
	}

}
