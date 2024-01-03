package com.Abhishek;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       num=sc.nextInt();
       
       if (num%5==0) {
    	  if(num%11==0) {
    		  System.out.println("divisible by both");
    	  }
    		  else{
    			  System.out.println("not Divisible by 11");
    		  }
       }
       else {
    	   System.out.println("not Divisible by 5");
    	  
    	  
    	  }
       }
	}


