package com.bridgelabz;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number1 : ");
		int num1 = s.nextInt();
		
		System.out.println("enter a number2 : ");
		int num2 = s.nextInt();
	
		System.out.println("enter a number3 : ");
		int num3 = s.nextInt();
	    s.close();
	    
	    if(num1>num2 && num1>num3)
	    	System.out.println("Number1 is grater : " +num1);
	    else if(num2>num1 && num2>num3)
	    	System.out.println("Number2 is greater : " +num2);
	    else
	    	System.out.println("Number3 is greater : " +num3);
	}

}
