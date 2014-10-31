package test;
import static org.junit.Assert.*;

import java.PermutationSequence;

import org.junit.Test;


public class PermutationSequenceTest {

	@Test
	public void test() {
		PermutationSequence ps = new PermutationSequence();
		String expected = "2143";
		String actual = ps.getPermutation(4, 8);
		assertEquals(expected, actual);
	}

}
