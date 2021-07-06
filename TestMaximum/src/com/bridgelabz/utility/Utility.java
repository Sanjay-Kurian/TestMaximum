package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	
	public Integer getInt() {
		return scanner.nextInt();
	}
	
	public Float getFloat() {
		return scanner.nextFloat();
	}
	
	public String getString() {
		return scanner.next();
	}
	
	public Integer compareTo(Integer num1, Integer num2, Integer num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}
		else if(num2 > num1 && num2 > num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
	
	public Float compareTo(Float num1, Float num2, Float num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}
		else if(num2 > num1 && num2 > num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
}
