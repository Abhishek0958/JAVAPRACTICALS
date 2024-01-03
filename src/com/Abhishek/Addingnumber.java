package com.Abhishek;

import java.util.Scanner;

public class Addingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start point");
		int i=sc.nextInt();
		System.out.println("Enter end point");
		int end=sc.nextInt();
		
		int sum=0;int count=0;int j=1;
//		
//		while(i<=end) {
//			sum=sum+i;
//			i++;	
//		}
	//	System.out.println(sum);
		//primenumber
		while(i<=end) {
			while(j<=i) {
			if(i%j==0) {
			count++;
			}			
			j++;
		}
			i++;
			if(count==2) {	
				System.out.println(i);
				}
				
		}
		
			
		}
		
		
		
		
        
	}


