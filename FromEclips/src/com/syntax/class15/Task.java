package com.syntax.class15;

public class Task {

	public static void main(String[] args) {
		
		String momName="MARY";
		String dadName="DANIEL";
		
		String gender="boy";
		
	if(gender.equals("boy")) {
		System.out.println(momName.substring(2,4)+(dadName.substring(0,3)));
	
		String gender1="girl";
	}else if (gender.equals("girl")) {
		System.out.println(momName.substring(0,2)+(dadName.substring(3,6)));
	}else {
		System.out.println("Invalid");
}
	}
	}