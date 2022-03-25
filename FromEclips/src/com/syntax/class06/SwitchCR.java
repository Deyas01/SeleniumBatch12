package com.syntax.class06;

import java.util.Scanner;

public class SwitchCR {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the age of the child");
int age=b.nextInt();
String year=b.nextLine();
		switch (age){
		case 1:
      age= 1;
		  System.out.println("You can Crawl");
		break;
		case 2:
    age=2;
		  System.out.println("You can Talk");
		break;
		case 3:
  age=3;
		  System.out.println("You can Dance");
		break;
		case 4:
    age=4;
		  System.out.println("You can get Trouble");
		  break;
   case 5:
  age=5;
		System.out.println("I don't know how old you are");
      break;
    default:
      System.out.println("Invalid");
		}
		}
	}
