package com.Abhishek;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter character");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        
        
        if((ch>='a' && ch<='z' ) || (ch>='A' && ch<='Z' ))
        {
        	System.out.println("it is Alphabet");
        }
        else if((ch>='0' && ch<='9')){
        	System.out.println(" it is number");
        }
        else {
        	System.out.println("special char");
	}

	}

}
