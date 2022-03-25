package com.syntax.class06;

import java.util.Scanner;

public class Rep42 {

	 public static void main(String[] args) {
		 Scanner f=new Scanner(System.in);
		 System.out.println("Is it weekend?");

		 boolean subject = f.nextBoolean();

		 if (subject==false){
		 System.out.println("manual testing");

		 }else if (subject==true){
		   System.out.println("Java");
		   
		 System.out.println("Today you will be learning "+subject);

	}
	 }
}
