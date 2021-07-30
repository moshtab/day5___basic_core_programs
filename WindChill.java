package com.bridgelabz;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter temperature : ");
		double t = s.nextDouble();
		if (t>50) {
			System.out.println("please select temperature in range from 0 to 50");
			System.exit(0);      // it will exit if it is >50
		}
		System.out.println("enter velocity : ");
		double v = s.nextDouble();
		if (v<3 && v>120) {
			System.out.println("please select velocity in range fronm 3 to 120");
			System.exit(0);  // used exit commad
		}
		s.close();
		double w = 35.74+(t*0.615)+(0.4275*t-35.75)*(Math.pow(v, 0.16));  /// Used Math.pow() function.     
		System.out.printf("The wind chill is :%.2f ",w);                 ///Ex: Math.pow(a, b) where 'a' is base and 'b' is exponent.


	}

}
