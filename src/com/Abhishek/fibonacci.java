package com.Abhishek;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int sum=0;
//		for(int i=0;i<=10;i++) {
//			for(int j=1;j>i;j++) {
//				sum=j+i;
//				System.out.println(sum);
//				
//			}
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int num =sc.nextInt();
			int factorial=0;
			for (int k=num;k>1;k--) {
				factorial= k * (k-1);
			}
			
			System.out.println(factorial);
			
	}

}

