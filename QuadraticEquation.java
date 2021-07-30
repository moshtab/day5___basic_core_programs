package com.bridgelabz;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 'a' value : ");
		double a = s.nextDouble();
		System.out.println("enter 'b' value : ");
		double b = s.nextDouble();
		System.out.println("enter 'c' value : ");
		double c = s.nextDouble();
		s.close();
        ///creating a object
		QuadraticEquation qe = new QuadraticEquation();
		qe.QuadraticRoots(a, b, c);
		
	}
	public void QuadraticRoots(double a, double b, double c) {
		double delta,root1,root2;
		delta =(b*b)-(4*a*c);
		if (delta>0) {
			root1 = (-b+Math.sqrt(delta))/(2*a);
			root2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.printf("root1:%.2f\n root2:%.2f",root1,root2);
		}
		else if(delta==0) {
			root1=-b/(2*a);
			root2=-b/(2*a);
			System.out.printf("root1:%.2f\n root2:%.2f",root1,root2);
			
		}
		else
			System.out.println("Roots are imaginary");
	}

}
