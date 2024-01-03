package com.Abhishek;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Bsal;
		 double Gsal,HRA,DA;
	       Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter your basic salary");
			Bsal=sc.nextInt();
			
			if(Bsal<=10000) {
				HRA = (Bsal * 20) / 100;
				DA = (Bsal * 80) / 100;
				Gsal = Bsal + HRA + DA;
				System.out.println("your gross salary is "+ Gsal);
				
			}
			else if(Bsal<=20000) {
				HRA = (Bsal * 25) / 100;
				DA = (Bsal * 90) / 100;
				Gsal = Bsal + HRA + DA;
				System.out.println("your gross salary is "+ Gsal);
				
			}
			else {
				HRA = (Bsal * 30) / 100;
				DA = (Bsal * 95) / 100;
				Gsal = Bsal + HRA + DA;
				System.out.println("your gross salary is "+ Gsal);
				
			}
			
			

	}

}
