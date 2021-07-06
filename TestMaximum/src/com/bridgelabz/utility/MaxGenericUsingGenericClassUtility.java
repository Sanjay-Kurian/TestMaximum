package com.bridgelabz.utility;

public class MaxGenericUsingGenericClassUtility<t extends Comparable>{
	 t x, y, z;

	public MaxGenericUsingGenericClassUtility(t x, t y, t z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static <t extends Comparable> t getMaximumNumber(t num1, t num2, t num3) {
		t max = num1;
		if(num2.compareTo(max) > 0) 
			max = num2;
		else if(num3.compareTo(max) > 0)
			max = num3;
		
		return max;
	}
	
	public t  maximum() {
		System.out.println("Maximum number is: "+getMaximumNumber(x, y, z));
		return getMaximumNumber(x, y, z);
	}
}

