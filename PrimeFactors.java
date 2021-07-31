package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = s.nextInt();
		s.close();
		primeFactors(num);
	}

	public static void primeFactors(int num) {

		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;
			}
		}
		if (num >= 2)
			System.out.println(num);

	}

}
