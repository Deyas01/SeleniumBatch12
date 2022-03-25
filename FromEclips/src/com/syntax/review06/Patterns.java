package com.syntax.review06;

public class Patterns {

	public static void main(String[] args) {

		for (int i=1; i<=5; i++) {
			System.out.println("*");
}
		System.out.println();
		
		for (int i=1; i<=5; i++) {
			System.out.println("*");
	}
		for (int i=1; i<=5; i++) {
			System.out.print("*");
}
		System.out.println();
		
		System.out.println("------------ Better way-----------");
		for (int r=1; r<=4; r++) {
			for (int col=1; col<=5; col++) {

			System.out.print("*");
			}
			System.out.println();
		
}
		System.out.println("-----------------------");
		for (int r=1; r<=10; r++) {
			for (int col=1; col<=10; col++) {

			System.out.print(" * ");
			}
			System.out.println();
			
}
		System.out.println("------------ -----------");
		
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {

			System.out.print(r+" ");
			}
			System.out.println();
		
	}
}
}