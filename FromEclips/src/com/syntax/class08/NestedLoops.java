package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			
			System.out.println("I am i loop "+i);
			
			for(int j=1; j<=2; j++) {
				
				System.out.println("I am nested j loop"+j);
				
			}
			System.out.println("Newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
			
			for(int a=10; a<=4; a++) {
				System.out.println(a);
			for(int j=1; j<3; j++) {
				System.out.println(j);
			}
			System.out.println(" - - ");
			}
			System.out.println("Newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
			for (int b=0; b<=9; b++) {
				for (int d=0; d<=9; d++) {
					for (int f=0; f<=9; f++) {
						System.out.println(b+" "+d+" "+f);
					}
			} 
}
		}
	}
}