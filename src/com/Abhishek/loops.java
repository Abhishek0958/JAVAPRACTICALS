package com.Abhishek;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start point");
		int i=sc.nextInt();
		System.out.println("Enter end point");
		int end=sc.nextInt();
		
		
		
		if(i<end) {
		while(i<=end) {
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
			
		}
		}
		else
		{
			while(i>=end) {
				System.out.println(i);
				i--;
		}
		}

	}

}
