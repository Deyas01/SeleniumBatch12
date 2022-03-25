package com.syntaclass5;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	
	System.out.println("Enter your height in inch");
	int height=xyz.nextInt();
	if(height<60) {
		System.out.println("You ar Short");
	}else if (height>=60 && height<=72) {
		System.out.println("You are Medium");
	}else if(height>72) {
		System.out.println("You are Medium");
	}
	}

}