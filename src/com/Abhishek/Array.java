package com.Abhishek;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int []marks;
//        
//        marks=new int[5];
//        marks[0]=76;
//        marks[1]=86;
//        marks[2]=66;
//        marks[3]=56;
//        marks[4]=46;
//        
//      for(int i=0;i<=4;i++) {
//        System.out.println(marks[i]);
//
//}
//      System.out.println("length of marks is " + marks.length);
//      
//      Scanner sc=new Scanner(System.in);
//      
//      int []marks1=new int[5];
//      for(int i=0;i<=4;i++) {
//    	  System.out.println( "enter marks of subject "  + (i+1));
//          marks1[i]=sc.nextInt();
//  }
//      for(int i=0;i<=4;i++) {
//          System.out.println(marks1[i]);
//
//  }
		
//		 Scanner sc=new Scanner(System.in);
//	     
//	      int []marks1=new int[5];
//	      for(int i=0;i<=4;i++) {
//	    	  System.out.println( "enter marks of subject "  + (i+1));
//	          marks1[i]=sc.nextInt();
//	  }
//	      for(int i=0;i<=4;i++) {
//	    	  if(marks1[i]%2==0) {
//	    		
//	          System.out.println(marks1[i]);
//	    	  }
//	  }

		
		 Scanner sc=new Scanner(System.in);
	    //asigning
		 int sum=0;int max=0;int count=0;
	      String []subject={"English","Maths","Science","History","Geography"};
	      int []marks1=new int[5];
	      for(int i=0;i<=4;i++) {
	    	  System.out.println( "enter marks of "+subject[i]+ " ");
	          marks1[i]=sc.nextInt();
	  }
	      //show and sum of marks
	      for(int i=0;i<=4;i++) {
	    		  sum=sum+marks1[i];
	          System.out.println(marks1[i]);
	    	  }
	      System.out.println("total is " +sum);
	 //maximum marks 
	 for(int i=0;i<=4;i++) {
		  if(marks1[i]>max) {
			  max=marks1[i];
		  }
	  }
	 System.out.println("max marks is " + max);
	 //minimum marks
	 int min=marks1[0];
	 for(int i=0;i<=4;i++) {
		  if(marks1[i]<min) {
			  min=marks1[i];
		  }
	  }
	 System.out.println("min marks is " + min);
	 //count even marks
	 for(int i=0;i<=4;i++) {
   	  if(marks1[i]%2==0) {
   		count++;
   	  }
	 }
	 System.out.println("even marks is " + count);
}
}
