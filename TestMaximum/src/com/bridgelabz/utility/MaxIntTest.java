package com.bridgelabz.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxIntTest {

	@Test
	void testFirstInteger() {
		Utility test = new Utility();
		Integer ans = test.compareTo(22, 6, 8);
		assertEquals(22,ans);
	}
	
	@Test
	void testSecondInteger() {
		Utility test = new Utility();
		Integer ans = test.compareTo(4, 22, 8);
		assertEquals(22,ans);
	}
	
	@Test
	void testThirdInteger() {
		Utility test = new Utility();
		Integer ans = test.compareTo(4, 9, 22);
		assertEquals(22,ans);
	}
}
