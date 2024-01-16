package q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMultTest {
	int[] a1 = {1, 2, 3};
	int[] a2 = {2, 3, 4, 5};
	int[] f = {2, 6, 12, 5};
	ArrayMult a = new ArrayMult();
	@Test
	public void test() {
		assertEquals(f, a.mult(a1, a2));
	}

}
