package test;
import java.util.List;

import javacode.SubstringWConcatenationOAllWords;

import org.junit.Test;

public class SubstringWConcatenationOAllWordsTest {

	@Test
	public void test() {
		SubstringWConcatenationOAllWords swoaw = new SubstringWConcatenationOAllWords();
		String S = "aaabbbc";
		String[] L = {"a","a","b","b","c"};
		List<Integer> res = swoaw.findSubstring(S, L);
		for(int r : res){
			System.out.println(r);
		}
	}

}
