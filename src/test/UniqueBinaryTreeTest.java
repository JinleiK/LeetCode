package test;
import static org.junit.Assert.*;

import java.UniqueBinaryTree;

import org.junit.Test;


public class UniqueBinaryTreeTest {

	@Test
	public void test() {
		UniqueBinaryTree ut = new UniqueBinaryTree();
		int expected = 42;
		int actual = ut.numTrees(5);
		assertEquals(expected, actual);
	}

}
