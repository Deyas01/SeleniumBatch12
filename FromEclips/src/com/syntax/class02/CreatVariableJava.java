package com.syntax.class02;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class CreatVariableJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");

		String WORD1=scan.next();
		String WORD2=scan.next();
		System.out.println("Please enter two numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		if (n1==n2 && WORD1.equals(WORD2)) {
		System.out.println("AND");		
		}else if (n1==n2 || WORD1.equals(WORD2)) {
			System.out.println("OR");
		}else if (n1==n2 || !WORD1.equals(WORD2)) {
		System.out.println("NONE");
		}else {
	System.out.println("Invalid");
		}
}
}
