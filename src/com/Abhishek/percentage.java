package com.Abhishek;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int physics,chemistry,maths,Biology,Computer,marks;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter physics");
		physics=sc.nextInt();
		
		System.out.println("Enter chemistry");
		chemistry=sc.nextInt();
		
		System.out.println("Enter maths");
		maths=sc.nextInt();
		
		System.out.println("Enter Biology");
		Biology=sc.nextInt();
		
		System.out.println("Enter Computer");
		Computer=sc.nextInt();
		
		
	
		marks=(physics + chemistry + maths + Biology + Computer);
		System.out.println(marks);
		double percentage = (marks*100)/ 500;
		System.out.println(percentage);
		
		if (percentage>=90) 
			System.out.println("GRADE A");
		else if (percentage>=80) 
			System.out.println("GRADE B");
		else if (percentage>=70) 
			System.out.println("GRADE C");
		else if (percentage>=60) 
			System.out.println("GRADE D");
		else if (percentage>=40) 
			System.out.println("GRADE E");
		else 
			System.out.println("GRADE F");
		

	}

}
