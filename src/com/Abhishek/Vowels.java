package com.Abhishek;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter character");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
        {
        	System.out.println("it is Vowel");
        }
        else {
        	System.out.println(" it is Consonent");
        }
	}

}
