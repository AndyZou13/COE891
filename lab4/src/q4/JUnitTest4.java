package q4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest4 {
	
	isPrime p1 = new isPrime();
	
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void testSkipWhile() {
		p1.printPrimes(0);
		Assert.assertEquals("Prime: 2", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void testFullPath() {
		p1.printPrimes(3);
		Assert.assertEquals("Prime: 2\r\nPrime: 3\r\nPrime: 5", outputStreamCaptor.toString().trim());
	}
	
	@After
	public void tearDown() {
	    System.setOut(standardOut);
	}
}
