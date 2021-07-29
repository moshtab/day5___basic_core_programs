package com.bridgelabz;

import java.util.Random;

public class Flipcoin {

	   public static void main(String[] args) {
		int heads=0;
		int tails=0;
		
		for(int i=0;i<40;i++) {
		   Random r = new Random();
		   int flip = r.nextInt(2);
		   
		   if (flip==0) 
			   heads=heads+1;
		   else
		      tails=tails+1;
	   }
		
		System.out.println("heads won is :" +heads);
		
		System.out.println("tails won is : " +tails);

	}

}
