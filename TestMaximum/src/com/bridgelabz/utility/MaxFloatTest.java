package com.bridgelabz.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxFloatTest {

	@Test
	void testFirstFloat() {
		Utility test = new Utility();
		Float ans = test.compareTo(22.34f, 6.46f, 11.46f);
		assertEquals(22.34f,ans);
	}
	
	@Test
	void testSecondFloat() {
		Utility test = new Utility();
		Float ans = test.compareTo(7.38f, 22.34f, 11.46f);
		assertEquals(22.34f,ans);
	}
	
	@Test
	void testThirdFloat() {
		Utility test = new Utility();
		Float ans = test.compareTo(10.96f, 6.46f, 22.34f);
		assertEquals(22.34f,ans);
	}
}