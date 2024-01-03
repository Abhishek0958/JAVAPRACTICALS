package com.Abhishek;

import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter rows");
		int rows=sc.nextInt();
		System.out.print("Enter col");
		int col=sc.nextInt();
		int [][] matrix=new int[rows][col];
		int sum=0;
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter number");
				matrix [i][j]=sc.nextInt();
				
			}
		
			
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix [i][j] + " ");
				
			}
			System.out.println("");
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				sum=sum+matrix[i][j];
				
			}
			System.out.println("sum is " +sum);
			sum=0;
		}

	}

}
