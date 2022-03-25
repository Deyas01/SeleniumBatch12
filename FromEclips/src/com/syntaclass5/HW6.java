package com.syntaclass5;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		Scanner birth=new Scanner(System.in);
		System.out.println("Enter the month you were born");
	String month=birth.next();
	if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Feberuary")) {
	System.out.println("You were born in Winter");
	} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
	System.out.println("You were born in Spring");
	}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
	System.out.println("You were born in Summer");
	}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("Novermber")) {
		System.out.println("You were born in Fall");

			}
	}
}
