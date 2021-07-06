package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class MaximumInteger {
	public static void main(String[] args) {
		System.out.println("Enter 3 integers");
		Utility utility = new Utility();
		Integer number1 = utility.getInt();
		Integer number2 = utility.getInt();
		Integer number3 = utility.getInt();
		System.out.println(utility.compareTo(number1, number2, number3) +" is the maximum number");
	}
}
