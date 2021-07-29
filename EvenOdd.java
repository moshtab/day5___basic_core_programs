package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//if a number is divisible by 2 then it is even or it is odd
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = s.nextInt();
		s.close();
		
		if(num%2==0)
			System.out.println(num+ "  is even ");
		else
			System.out.println(num+ " is odd ");

	}

}
