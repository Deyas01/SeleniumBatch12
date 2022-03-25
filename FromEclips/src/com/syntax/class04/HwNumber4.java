package com.syntax.class04;

import java.util.Scanner;

public class HwNumber4 {

	public static void main(String[] args) {
		Scanner credit=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
	String answer=credit.next();
	if(answer.equals("Yes")) {
		System.out.println("What is the balance of you credit?");
	double balance=credit.nextInt();
	if (balance>1000) {
		System.out.println("Pay it off immediately");
	}else { 
		System.out.println("You can spend more");
	}
	}
	}	
	}

