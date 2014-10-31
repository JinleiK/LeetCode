package test;
import static org.junit.Assert.*;

import java.ContainerWMostWater;

import org.junit.Test;


public class ContainerWMostWaterTest {

	@Test
	public void test() {
		ContainerWMostWater c = new ContainerWMostWater();
		int[] h = {1,5,1,1,1,5};
		int expected = 20;
		int actual = c.maxArea(h);
		assertEquals(expected, actual);
	}

}
