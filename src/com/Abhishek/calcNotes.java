package com.Abhishek;

import java.util.Scanner;

public class calcNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int amount,notes;
       Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter amount");
		amount=sc.nextInt();
		
		if (amount>=2000) {
			notes=amount/2000;
			amount =amount%2000;
			System.out.println("2000 notes is "+ notes);
		}
		if (amount>=500) {
			notes=amount/500;
			amount =amount%500;
			System.out.println("500 notes is "+ notes);
		}
		if (amount>=200) {
			notes=amount/200;
			amount =amount%200;
			System.out.println("200 notes is "+ notes);
		}
		if (amount>=100) {
			notes=amount/100;
			amount =amount%100;
			System.out.println("100 notes is "+ notes);
		}
		if (amount>=50) {
			notes=amount/50;
			amount =amount%50;
			System.out.println("50 notes is "+ notes);
		}
		if (amount>=20) {
			notes=amount/20;
			amount =amount%20;
			System.out.println("20 notes is "+ notes);
		}
		if (amount>=10) {
			notes=amount/10;
			amount =amount%10;
			System.out.println("10 notes is "+ notes);
		}
		if (amount>=5) {
			notes=amount/5;
			amount =amount%5;
			System.out.println("5 coins is "+ notes);
		}
		if (amount>=1) {
			notes=amount/1;
			amount =amount%1;
			System.out.println("1 notes is "+ notes);
		}

		


		
		
		
	}

}
