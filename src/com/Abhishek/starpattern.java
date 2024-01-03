package com.Abhishek;

public class starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		System.out.print(j);
	}
	System.out.println();
}
System.out.println();

for (int i=5;i>0;i--) {
	for(int j=5;j>0;j--) {
		System.out.print(j);
	}
	System.out.println();
}
System.out.println();

for (int i=1;i<=5;i++) {
	for(int j=5;j>0;j--) {
		System.out.print(i);
	}
	System.out.println();
}
System.out.println();

for (int i=5;i>0;i--) {
	for(int j=5;j>0;j--) {
		System.out.print(i);
	}
	System.out.println();
}
System.out.println();

for (int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if((i==2 && j==3) || (i==3 && j==3)) {
		System.out.print(" 0 ");
	}
		else {
			System.out.print(" * ");
		}
	
}

	System.out.println();



		
		
	}

System.out.println();

for (int i=0;i<=3;i++) {
	for(int j=0;j<=3;j++) {
		if((i==1 && j==1) || (i==1 && j==2) || (i==2 && j==1) || (i==2 && j==2)) {
		System.out.print("   ");
	}
		else {
			System.out.print(" * ");
		}
	
}

	System.out.println();	
		
	}

System.out.println();

for (int i=0;i<=5;i++) {
	for(int j=0;j<=i;j++) {
			System.out.print(" * ");
		
}
	System.out.println();			
	}


for (int i=0;i<=5;i++) {
	for(int j=5;j>i;j--) {
			System.out.print(" * ");
		
}
	System.out.println();			
	}
System.out.println();

for (int i=0;i<=5;i++) {
	for(int j=5;j>=i;j--) {
		System.out.print(" ");
	}
		for(int k=0;k<=i;k++){
			System.out.print("* ");
		
}System.out.println();	
	}


			
	}





}

