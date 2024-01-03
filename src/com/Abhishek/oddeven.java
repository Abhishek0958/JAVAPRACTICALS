package com.Abhishek;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter number");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		if (num%2==0) 
			System.out.println("even number");
		else 
			System.out.println("odd number");
		
	}

}
