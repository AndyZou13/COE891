package q2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	Triangle t1;
	Triangle t2;
	Triangle t3;
	Triangle t4;
	Triangle t5;
	@Before
	public void setup () {
		t1 = new Triangle (3, 4, 5);
		t2 = new Triangle (5, 4, 3);
		t3 = new Triangle (8, 5, 5);
		t4 = new Triangle (3, 3, -3);
		t5 = new Triangle (3, 4, 100);
	}
	@Test 
	public void testTriValid () {
		 boolean a = (t5.side1 < t5.side2 + t5.side3);
		 boolean b = (t5.side2 < t5.side1 + t5.side3);
		 boolean c = (t5.side3 < t5.side1 + t5.side2);
		 assertTrue(a);
		 assertTrue(b);
		 assertTrue(c);
	}
	@Test
	public void testTri1 () {
		double s = (t1.side1 + t1.side2 + t1.side3) * 0.5;
		double area = Math.sqrt(s * (s - t1.side1) * (s - t1.side2) * (s - t1.side3));
		try {
			assertEquals(area, t1.calculateArea(), 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void testTri2 () {
		double s = (t2.side1 + t2.side2 + t2.side3) * 0.5;
		double area = Math.sqrt(s * (s - t2.side1) * (s - t2.side2) * (s - t2.side3));
		try {
			assertEquals(area, t2.calculateArea(), 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void testTri3 () {
		double s = (t3.side1 + t3.side2 + t3.side3) * 0.5;
		double area = Math.sqrt(s * (s - t3.side1) * (s - t3.side2) * (s - t3.side3));
		try {
			assertEquals(area, t3.calculateArea(), 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void testTriEq() {
		try {
			double area1 = t1.calculateArea();
			double area2 = t2.calculateArea();
			assertEquals(area1, area2, 0.0001);
		} catch (Exception e) {
			fail(e.getMessage());
		}	
	}
	@Test
	public void testNeg () {
		try {
			double area = t4.calculateArea();
		} catch (Exception e) {
			assertEquals("side length less than 0", e.getMessage());
		}
	}
}
