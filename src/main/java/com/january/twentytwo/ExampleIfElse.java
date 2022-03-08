package com.january.twentytwo;

public class ExampleIfElse {
	public static void main(String args[]) {
		int year = 2022;
		// find leap year using if else
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Common year");
		}
		int mark = 59;
		// assign grade using if else if else
		if (mark >= 80) {
			System.out.println("A Grade");
		} else if (mark >= 60 && mark <= 79) {
			System.out.println("B Grade");
		} else if (mark >= 40 && mark <= 59) {
			System.out.println("C Grade");
		} else {
			System.out.println("Fail");
		}
	}
}
