package com.syntax.class04;

import java.util.Scanner;

public class HwNumber6 {

	public static void main(String[] args) {
Scanner num=new Scanner(System.in);
	System.out.println("Write the numbers!");
int num1 = num.nextInt();
int num2 = num.nextInt();
int num3 = num.nextInt();

	if (num1>num2) {
		System.out.println("Number 2 is larger");
		
			}else if (num1>num3){
				System.out.println("Number 3 is the largest number");
				
			}else if (num2<=num3) {
				System.out.println("Number 3 is the largest");
				
			}else {
				System.out.println("Thanks!");
	}

	}
}
