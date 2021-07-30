package com.bridgelabz;

import java.util.Scanner;

public class EuclideanDistance {

	public static void main(String[] args) {
		//In euclidean distance we are finding distance from origin(0,0) to a point(x,y)
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of 'x' : ");
		double x = s.nextDouble();
		System.out.println("enter value of 'y' : ");
		double y = s.nextDouble();
		s.close();
		double distance = Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2))); /// Used Math.pow() function.     
		System.out.printf("Euclidean distance is :%.2f ",distance);       ///Ex: Math.pow(a, b) where 'a' is base and 'b' is exponent.

	}

}
