package com.bridgelabz;

import java.util.Scanner;

public class QutRem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number1 : ");
		int num1 = s.nextInt();
		
		System.out.println("enter a number2 : ");
		int num2 = s.nextInt();
		s.close();
		
		double quotient = (double)num1/num2;
		double Remainder =(double) num1%num2;
		System.out.println("quotient is : " +quotient);
		System.out.println("remainder is : " +Remainder);

	}

}
