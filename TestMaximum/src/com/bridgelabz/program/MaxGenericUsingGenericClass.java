package com.bridgelabz.program;

import com.bridgelabz.utility.MaxGenericUsingGenericClassUtility;

public class MaxGenericUsingGenericClass {
	public static void main(String[] args) {
			Integer a = 10;
			Integer b = 110;
			Integer c = 1;
			new MaxGenericUsingGenericClassUtility<Integer>(a, b, c).maximum();
	}
}
