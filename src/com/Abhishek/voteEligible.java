package com.Abhishek;
import java.util.Scanner;


public class voteEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter age");
		Scanner sc =new Scanner(System.in);
		age=sc.nextInt();
		if (age>=18) 
			System.out.println("you are eligible to vote");
		else 
			System.out.println("you are not eligible to vote");
		
		
		

	}

}
