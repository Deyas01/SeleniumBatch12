package com.syntax.class06;

import java.util.Scanner;

public class HW1_C6 {

	public static void main(String[] args) {
		
	Scanner exp=new Scanner(System.in);
	System.out.println("Enter your grade");
	String answer;
	String grade=exp.next();
	switch (grade.toUpperCase()) {
	case "A":
		answer="Excellent";
		break;
	case "B":
	answer="Good";
		break;	
	case "C":
	answer="Average";
		break;
	case "D":
		answer="Bad";
	default:
		answer="Not Acceptable";
	}
	System.out.println("You entered grade "+grade+" and the result is "+answer);
}
}
