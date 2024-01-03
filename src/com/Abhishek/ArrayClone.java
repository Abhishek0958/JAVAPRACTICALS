package com.Abhishek;

import java.util.Scanner;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
		
//		 int []Array1= {10,20,30,40,50};
//         int []Array2=Array1;
//         for(int i=0;i<Array2.length;i++) {
//   		 
//         System.out.println(Array2[i]);
//   	  }
//	
		
		 int []Array1= {10,20,30,40,50};
         int []Array2=new int[Array1.length];
        
         for(int i=0;i<Array2.length;i++) {
   		 Array2[i]=Array1[i];
         
   	  }
         Array1[0]=100;
         for(int i=0;i<Array2.length;i++) {
       		
        	 System.out.println(Array2[i]);
       	  }
        
	}

}
