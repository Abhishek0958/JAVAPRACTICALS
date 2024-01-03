package com.Abhishek;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		short p=300;
		byte q =(byte)p;
		System.out.println(p);
		
		
		
		short m=256;
		byte n =(byte)m;
		System.out.println(n);
		
		
		//implicit
		byte a=10;
		int b=a;
		System.out.println(b);
		
		
		
		//explicit
       int x=10;
       //casting
       byte y=(byte) x;
       System.out.println(y);
       
       
       double i=10.99;
       int j=(int)i;
       System.out.println(j);
	}

}
