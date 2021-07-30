package com.bridgelabz;

import java.util.Scanner;

public class Sum_Of_Three_Integers_Adds_to_Zero {
	
	static void FindTriplets(int[] array, int size) {
		int count =0;
		for (int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				for(int k=j+1;k<size;k++) {
					if(array[i]+array[j]+array[k]==0) {  //checking triplets
						System.out.println("Triplets are : " +array[i]+" "+array[j]+" "+array[k]);
						count=count+1;
					}		
				}
			}
		}
		System.out.println("number of triplets adding to zero are : "+count);
		if(count==0)
			System.out.println("no triplets exists ");
	}
	
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size = s.nextInt();
		int[] array = new int[size];  /// creating the array with size of array taking from user input.
		for (int i=0;i<size;i++) {
			System.out.println("enter the elements of array ");   
			array[i]=s.nextInt();      /// creating the elements is array
		}
		for (int i=0;i<size;i++) {
			System.out.print(array[i]+" ");    // printing the elements of array
		}
		System.out.println();
		s.close();
		FindTriplets(array,size);

	}

}
