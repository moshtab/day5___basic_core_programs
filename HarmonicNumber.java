package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		double num = s.nextDouble();
		s.close();
		harmonicNumber(num);
	}

	public static void harmonicNumber(double num) {
		double sum = 0;
		for (int i = 1; i <= num; i++) {
			double H = (double) 1 / i;
			sum = sum + H;
		}
		System.out.printf("Harmonic nunber is %.2f ", sum); /// for limiting decimal value upto 2 digits while using
															/// double

	}

}
