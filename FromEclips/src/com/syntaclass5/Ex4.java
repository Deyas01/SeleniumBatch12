package com.syntaclass5;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
Scanner a=new Scanner(System.in);
System.out.println("Please enter today's day");
String day = a.next();
if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
	System.out.println("There is no class today");
} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
	System.out.println("Today's class is Manual Testing");
} else if (day.equalsIgnoreCase("Thursday")) {
	System.out.println("Today is a review class");
} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
	System.out.println("Today's class is Java");
} else {
	System.out.println("Invalid day entered");
}
	}
}
