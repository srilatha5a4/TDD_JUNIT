package epam.com.Tdd_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove1test {
	/*
	  1. ABCD => BCD
	  2. AACD => CD
	  3. BACD => BCD
	  4. BBAA => BBAA
	  5. AABAA => BAA
	  6. "" => ""
	  7. A => ""
	  8. AA => ""
	 */

	Remove1 rem1;
	@BeforeEach
	public void setUp() {
		rem1 = new Remove1();
	}
	
	@Test
	void testFirstTwo() {
		assertEquals("CD", rem1.removeA("AACD"));
	}
	@Test
	void testFirst1() {
		assertEquals("BCD", rem1.removeA("ABCD"));
	}
	@Test
	void testSecond1() {
		assertEquals("BCD", rem1.removeA("BACD"));
	}
	@Test
	void testNo1() {
		assertEquals("BBAA", rem1.removeA("BBAA"));
	}
	@Test
	void testEmpty() {
		assertEquals("", rem1.removeA(""));
	}
	@Test
	void testOnlya() {
		assertEquals("", rem1.removeA("A"));
	}
	@Test
	void testOnlyb() {
		assertEquals("", rem1.removeA("AA"));
	}

}

