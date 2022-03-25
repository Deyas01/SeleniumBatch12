package com.syntax.class07;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner tag=new Scanner(System.in);
			System.out.println("Enter your first name");
		String name=tag.next();
			System.out.println("Enter your last name");
		String lastName=tag.next();
			System.out.println("Enter your age");
		int age=tag.nextInt();
		for (int i=0; i<5; i++) {
			System.out.println("Your name is "+name+" "+lastName+" and you are "+age+" years old");	
		}
		
		double price=2.99;
		System.out.println("Please pay for your coffee");
		Scanner in=new Scanner(System.in);
		double pay;
		
		do { 
			pay=in.nextDouble();
			if (pay>=3) {
				System.out.println("Please give less");
				
			} else if (pay<3) {
				System.out.println("Please give more money");
				} 
		} while (pay!=price); 
			
			System.out.println("Please enjoy your coffee");
			
	}

	}


