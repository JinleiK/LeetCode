package test;
import static org.junit.Assert.*;

import java.CountAndSay;

import org.junit.Test;


public class CountAndSayTest {

	@Test
	public void test() {
		CountAndSay cs = new CountAndSay();
		String expected = "111221";
		String actual = cs.countAndSay(5);
		assertEquals(expected, actual);
	}

}
