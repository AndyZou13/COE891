package q3test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import q3.Triclass;

public class TriclassTest {

	@Before
	public void init() {
		System.out.println("Testing started");
	}
	@After
	public void breakdown() {
		System.out.println("Testing is finished");
	}
	@Test
	public void isoTest() {
		System.out.println("Test 1 started");
		assertEquals("Isosceles", Triclass.classify(8, 5, 5));
		assertEquals("Isosceles", Triclass.classify(7, 5, 5));
		System.out.println("Test 1 finished");
	}
	@Test
	public void scalTest() {
		System.out.println("Test 2 started");
		assertEquals("Scalene", Triclass.classify(2, 1, 3));
		assertEquals("Scalene", Triclass.classify(2, 7, 9));
		System.out.println("Test 2 finished");
	}
	@Test
	public void equilTest() {
		System.out.println("Test 3 started");
		assertEquals("Equilateral", Triclass.classify(5, 5, 5));
		assertNotEquals("Equilateral", Triclass.classify(9, 5, 5));
		System.out.println("Test 3 finished");
	}
	@Test
	public void invalidTest() {
		System.out.println("Test 3 started");
		assertEquals("Invalid", Triclass.classify(1, 1, 9));
		assertEquals("Invalid", Triclass.classify(1, 1, 8));
		System.out.println("Test 3 finished");
	}
}
