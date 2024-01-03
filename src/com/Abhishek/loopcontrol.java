package com.Abhishek;

import java.util.Scanner;

public class loopcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=128;
		byte b=(byte)a;
		System.out.println(b);
		
		//factorial,fibonacci,armstrong,leap year
		
//		int a=1;
//		while(a<=10) {
//			System.out.println(a);
//			if(a==5) {
//				break;
//			}
//			a++;
//		}
		
		
		
//		int b=1;
//		while(b<=10) {
//			
//			if(b==5) {
//			 b++;
//			 continue;
//			}
//			System.out.println(b);
//			b++;
//		}
		
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int num=sc.nextInt();
		int num1=num;
		int reverse=0;
		while(num1!=0) {
			
			reverse=(reverse * 10) + (num1%10);
			
			num1=num1/10;
			}
		
		System.out.println(reverse);
		
		if(num==reverse) {
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	

	
			
		
		
		
		
		
		

	}

}
