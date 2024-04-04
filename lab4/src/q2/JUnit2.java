package q2;

import static org.junit.Assert.*;

import org.junit.Test;
public class JUnit2 {
	q2 q = new q2();
	

	@Test (expected = NullPointerException.class)
	public void testPalindromeNull() {
		String s = null;
		q2.isPalindrome(s);
	}
	@Test
	public void testPalindrome1() {
		String s = "sa";
		assertFalse(q2.isPalindrome(s));
	}
	@Test
	public void testPalindrome2() {
		String s = "saaa";
		assertFalse(q2.isPalindrome(s));
	}
}
