package com.syntax.class21;

public class MethodOverLoadDemo {

	static void add (int num1, int num2) {
		System.out.println(num1+num2);
		System.out.println("M1");
	}
	static void add(double num1, double num2) {
		System.out.println("M2");
		System.out.println(num1+num1);
		
	}
	public static void main(String[] args) {
		add(10,10);
	}
}
