package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a letter : ");
		char ch = s.next().charAt(0);
		s.close();
		vowelConsonant(ch);
	}

	public static void vowelConsonant(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			System.out.println(ch + " is vowel");
		else if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7'
				|| ch == '8' || ch == '9')
			System.out.println("it is a number");
		else
			System.out.println(ch + " is consonant ");

	}

}
