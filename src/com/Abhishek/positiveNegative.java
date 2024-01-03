package com.Abhishek;

import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		System.out.println("Enter num");
		Scanner sc =new Scanner(System.in);
		num1=sc.nextInt();
		if (num1>0) 
			System.out.println("positive number");
		else if (num1<0) 
			System.out.println("negative number");
		else 
			System.out.println("neutral number");
		
	}

}
