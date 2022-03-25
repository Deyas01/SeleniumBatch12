package com.syntax.class04;

import java.util.Scanner;

public class HwNumber2 {

	public static void main(String[] args) {
			
			Scanner dmv=new Scanner(System.in);
			System.out.println("How old are you?");
			
			int lisence=dmv.nextInt();
			if(lisence>=18) {
			System.out.println("You are qualified to get a drive lisence");

			}else {
			System.out.println("Get a learners permit");
			
			}

	}

}
