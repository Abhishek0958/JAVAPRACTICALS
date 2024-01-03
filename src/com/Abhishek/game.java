package com.Abhishek;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.println("select an option");
   	    System.out.println("1.To play the game");
   	    System.out.println("2.To Quit the Game");
   	    int n=sc.nextInt();
   	    
         
     do {
    	if (n==1)
    	{
    		System.out.println("enter number");
    		int num=sc.nextInt();
    		if(num%2==0) {
    			System.out.println("you win");
    			return;
    		}
    		else
    		{
    			System.out.println("try again");

    		}
    		}
    	
    	i++;
    	
    	}while(i<=5);
    	
         if(i==6) {
     		System.out.println("you lose");
     	}
     	
     	
     
     
	

}
	}
