package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a Java program to print the first 10 numbers of 
		 * Fibonacci series 0 1 1 2 3 5 8 13 21 34
		 */
		// Store the number of Fibbonacci series that we want to produce
		// Start from 0 and 1
		// Add the previous numbers to procde the next number
		// check if we have printed the required numbers or not
		int howMany=10;
		int previous=0;
		int current=1;
		int next=0;
		System.out.println(previous+" ");
		System.out.println(current+" ");
		for (int i=0; i<howMany-2;i++){
			next=previous+current;
			System.out.println(next+" ");
			previous=current;
			current=next;
		
	}

		System.out.println("Newwwwwwwwwwwwwwww");
		int a=0;
		int b=1;
			int c;
	
	for(int i=1; i<=10; i++) {
		c=a+b;
	System.out.print(" "+c);
		a=b;//swap method
		b=c;
}
}
}