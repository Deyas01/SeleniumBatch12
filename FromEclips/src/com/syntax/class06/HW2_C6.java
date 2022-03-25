package com.syntax.class06;
import java.util.Scanner;

public class HW2_C6 {
	public static void main(String[] args) {
		
	Scanner cal=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
		int num1=cal.nextInt();
		int num2=cal.nextInt();
	System.out.println("Enter an operator: +, -, *, /");
	String operator=cal.next();
	int result=0;
	if(operator.equals("+")) {
		result=num1+num2; 
	}else if (operator.equals("-")) {
		result=num1-num2;
	}else if (operator.equals("*")) {
		result=num1-num2;
	}else if (operator.equals("/")) {
		result=num1-num2;
	}else {
		System.out.println("Invalid");}
	System.out.println("Result is "+result); 
		
		
	}
		
	}

