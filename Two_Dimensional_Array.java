package com.bridgelabz;

import java.util.Scanner;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number of rows : ");
		int M = s.nextInt();
		System.out.println("enter a number of colums : ");
		int N = s.nextInt();
		int[][] arr =new int [M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.println("enter elements");
				arr[i][j]=s.nextInt();
				
			}
		}
		System.out.println("printing the elements");
        for(int i=0;i<M;i++) {
        	
        	for(int j=0;j<N;j++) {
        		System.out.print(arr[i][j] +"\t");
        	}
        	System.out.println();
        }
        s.close();

	}

}
