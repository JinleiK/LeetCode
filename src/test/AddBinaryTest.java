package test;
import static org.junit.Assert.*;
import java.AddBinary;

import org.junit.Test;

public class AddBinaryTest {

	@Test
	public void test() {
		AddBinary ab = new AddBinary();
		String a = "110";
		String b = "1";
		String expected = "111";
		String actual = ab.addBinary(a, b);
		assertEquals(expected, actual);
	}

}
