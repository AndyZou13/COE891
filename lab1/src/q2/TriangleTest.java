package q2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	Triangle t1;
	Triangle t2;
	Triangle t3;
	@Before
	public void setup () {
		t1 = new Triangle (3, 4, 5);
		t2 = new Triangle (5, 4, 3);
		t3 = new Triangle (8, 5, 5);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
