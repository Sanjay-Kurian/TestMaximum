package com.bridgelabz.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxStringTest {

	@Test
	void testFirstString() {
		Utility test = new Utility();
		String ans = test.compareTo("pineapple", "apple", "banana");
		assertEquals("pineapple",ans);
	}
	
	@Test
	void testSecondString() {
		Utility test = new Utility();
		String ans = test.compareTo("apple", "pineapple", "banana");
		assertEquals("pineapple",ans);
	}
	
	@Test
	void testThirdString() {
		Utility test = new Utility();
		String ans = test.compareTo("apple", "banana", "pineapple");
		assertEquals("pineapple",ans);
	}
}
