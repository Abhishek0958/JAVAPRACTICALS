package com.Abhishek;

import java.util.Scanner;

public class CalElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double unit,price,total,scharge;
	       Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter Units");
			unit=sc.nextInt();

			if(unit<=50) {
				price = unit * 0.50;
				scharge = (price * 20) / 100;
				total = price + scharge;
				System.out.println("your total bill is "+ total);
				
			}
			else if(unit<=150) {
				price = 25 + (unit-50) * 0.75;
				scharge = (price * 20) / 100;
				total = price + scharge;
				System.out.println("your total bill is "+ total);
				
			}
			else if(unit<=250) {
				price = 100 + (unit-150) * 1.20;
				scharge = (price * 20) / 100;
				total = price + scharge;
				System.out.println("your total bill is "+ total);
			}
			else {
				price =  220 + (unit - 250)* 1.50;
				scharge = (price * 20) / 100;
				total = price + scharge;
				System.out.println("your total bill is "+ total);
			}
			
	}

}
