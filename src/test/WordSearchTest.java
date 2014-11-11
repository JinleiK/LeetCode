package test;
import static org.junit.Assert.*;
import javacode.WordSearch;

import org.junit.Test;


public class WordSearchTest {

	@Test
	public void test() {
		WordSearch ws = new WordSearch();
		char[][] board = {{'a','b', 'c'}, {'a', 'e', 'd'}, {'a','f','g'}};
		String word = "aedcba";
		boolean actual = ws.exist(board, word);
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
