package com.bridgelabz.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxGenericTest {

	@Test
	void testString() {
		Utility test = new Utility();
		String t = test.compareTo("apple", "banana", "pineapple");
		assertEquals("pineapple",t);
	}
	
	@Test
	void testInteger() {
		Utility test = new Utility();
		Integer t = test.compareTo(43, 23, 98);
		assertEquals(98,t);
	}
	
	@Test
	void testFloat() {
		Utility test = new Utility();
		Float t = test.compareTo(43.34f, 23.22f, 36.87f);
		assertEquals(43.34f,t);
	}

}
