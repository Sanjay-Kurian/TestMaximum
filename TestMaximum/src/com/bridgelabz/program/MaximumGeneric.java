package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class MaximumGeneric {
	public static void main(String[] args) {
		System.out.println("Enter 3 integers");
		Utility utility = new Utility();
		Integer number1 = utility.getInt();
		Integer number2 = utility.getInt();
		Integer number3 = utility.getInt();
		System.out.println(utility.compareTo(number1, number2, number3) +" is the maximum number");
		
		System.out.println("Enter 3 float numbers");
		Float fnumber1 = utility.getFloat();
		Float fnumber2 = utility.getFloat();
		Float fnumber3 = utility.getFloat();
		System.out.println(utility.compareTo(fnumber1, fnumber2, fnumber3) +" is the maximum number");
		
		System.out.println("Enter 3 strings");
		String string1 = utility.getString();
		String string2 = utility.getString();
		String string3 = utility.getString();
		System.out.println(utility.compareTo(string1, string2, string3) +" is the longest string");
	}
}
