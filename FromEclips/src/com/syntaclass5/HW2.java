package com.syntaclass5;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		
		System.out.println("Please enter today's day");
		int day = d.nextInt();
	if (day>=1 && day<=5) {
		System.out.println("It is a weekday");
	}else if (day>=6 && day<=7) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("Invalid day entered");
	}	
	}
}