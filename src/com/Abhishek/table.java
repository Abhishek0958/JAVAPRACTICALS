package com.Abhishek;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of table");
		int table=sc.nextInt();
		System.out.println("Enter number");
		int num=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=10) {
			System.out.println(i*table);
			i++;
			
		}
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		

	}

}
