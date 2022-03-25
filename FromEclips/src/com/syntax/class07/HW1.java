package com.syntax.class07;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		int num=6;
		Scanner scan=new Scanner(System.in);
		int pr;
		System.out.println("Please pay for the coffee!");
		do {
			pr=scan.nextInt();
		if (pr<6) {
			System.out.println("Please pay more!");
		}else if (pr>6) {
			System.out.println("Please pay less!");
			}
		}while (num!=pr);
		System.out.println("Enjoy your coffee");
		}
	} 