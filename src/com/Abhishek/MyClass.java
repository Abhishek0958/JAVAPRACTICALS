package com.Abhishek;
class Calculator{
	float num1,num2;
	void add() {
		System.out.println(num1+num2);
	}
	
	void sub() {
		System.out.println("sub is" + (num1-num2));
	}
	
	void mul() {
		System.out.println(num1*num2);
	}
	
	void div() {
		System.out.println(num1/num2);
	}
}
public class MyClass {

	public static void main(String[] args) {
     Calculator c1=new Calculator();
     c1.num1=10;
     c1.num2=5;
     c1.add();
     c1.div();
     c1.sub();
     c1.mul();
	}

}
