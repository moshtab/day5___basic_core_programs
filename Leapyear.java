package com.bridgelabz;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// A leap year is a year which is divisible by 4 except for century years(years
		// ending with 00).
		// The century year is a leap year if it is exactly divisible by 400
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int year = s.nextInt();
		s.close();
		leapYear(year);
	}

	public static void leapYear(int year) {

		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;

			} else
				leap = true;
		} else
			leap = false;
		if (leap)
			System.out.println(year + " is a leap year ");
		else
			System.out.println(year + " is not a leap year ");

	}

}
