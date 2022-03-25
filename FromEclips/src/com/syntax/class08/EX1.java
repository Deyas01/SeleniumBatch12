package com.syntax.class08;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		for (int i=1; i<50; i++) {
			if (i%3==0)
			continue;
			System.out.print(i +" ");
	}
		System.out.println("Newwwwwwwwwwwwwwww");
		
		Scanner sc=new Scanner(System.in);
		String answer;
		do { 
			System.out.println("Do you want to apply for a credit card?");
			answer=sc.nextLine();
		}while (!answer.equals("yes"));
		System.out.println("Congrats");
		}
}
