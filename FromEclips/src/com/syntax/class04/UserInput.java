package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
System.out.println("Please enter your name");
String name=input.next();

System.out.println("Your name is "+name);

System.out.println(name+" Please enter age");
int age=input.nextInt();
System.out.println("Your name is "+name+" and your age is "+age);


System.out.println("Please enter country where you are from");

String country=input.next();
System.out.println("You are from "+country);

if(country.equals("USA")) {
System.out.println("You speak English");

}else if (country.equals("France")) {
	System.out.println("You speak French");
	
}else if (country.equals("Turkey")) {
	System.out.println("You speak Turkish");
	
}else {
	System.out.println("I do not know which language do you speak");
}
}
	}

