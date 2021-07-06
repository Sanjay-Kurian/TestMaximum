package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class MaximumString {
	public static void main(String[] args) {
		System.out.println("Enter 3 strings");
		Utility utility = new Utility();
		String string1 = utility.getString();
		String string2 = utility.getString();
		String string3 = utility.getString();
		System.out.println(utility.compareTo(string1, string2, string3) +" is the longest string");
	}
}
