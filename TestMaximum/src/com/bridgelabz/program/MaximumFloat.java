package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class MaximumFloat {
	public static void main(String[] args) {
		System.out.println("Enter 3 float numbers");
		Utility utility = new Utility();
		Float number1 = utility.getFloat();
		Float number2 = utility.getFloat();
		Float number3 = utility.getFloat();
		System.out.println(utility.compareTo(number1, number2, number3) +" is the maximum number");
	}
}
