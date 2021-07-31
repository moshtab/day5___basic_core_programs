package com.bridgelabz;

import java.util.Scanner;

public class PowersOf2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = s.nextInt();
		s.close();
		powersOfTwo(num);
	}

	public static void powersOfTwo(int num) {

		int answer = 1;
		for (int i = 0; i < num; i++) {
			answer = answer * 2;
		}
		System.out.println("2^N is :" + answer);
	}

}
