package test;
import static org.junit.Assert.*;

import java.DistinctSubsequences;

import org.junit.Test;


public class DistinctSubsequencesTest {

	@Test
	public void test() {
		DistinctSubsequences ds = new DistinctSubsequences();
		String S = "rabtbbit";
		String T = "rbt";
		int actual = ds.numDistinct(S, T);
		int expect = 4;
		assertEquals(expect, actual);
	}

}
