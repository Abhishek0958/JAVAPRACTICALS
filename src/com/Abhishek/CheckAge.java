package com.Abhishek;

import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age1,age2,age3;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter age of person 1");
	       age1=sc.nextInt();
	       System.out.println("Enter age of person 2");
	       age2=sc.nextInt();
	       System.out.println("Enter age of person 3");
	       age3=sc.nextInt();
	       
	       if (age1>age2 || age2>age1)
	       {
	    	  if(age1>age3) {
	    		  System.out.println("Age of person 1 is greater");
	    	  }
	    		  else if(age2>age3){
	    			  System.out.println("Age of person 2 is greater");
	    		  }
	    		  else {
	    			  System.out.println("Age of peron 3 is greater");
	    		  }
	       }
	       else {
	    	   System.out.println("Age of peron 3 is greater");
	    	  }
	}
}


