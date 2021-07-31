package com.bridgelabz;

public class Swaping {

	public static void main(String[] args) {
		int number1 = 2; // x,y are to swap
		int number2 = 3;
		swapping(number1, number2);
	}

	public static void swapping(int number1, int number2) {
		System.out.println("before swapping numbers : " + number1 + " " + number2);
		// swaping
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("after swapping of numbers : " + number1 + " " + number2);

	}

}
