package com.syntax.class13;

public class MethodsDemo1 {
	
	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}
	
	void edward(boolean isRaining) {
		if (isRaining) {
			System.out.println("I am staying home");
		}else {
			System.out.println("Let's go for a walk");
		}
	}
	void checkPerson(String name) {
		if ("Teyfur".equals(name)) {
			System.out.println("Memer ");
		}
		else if ("Teyfur".equals(name)) { 
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo1 object1=new MethodsDemo1();
		object1.checkEvenOdd(120);
		object1.checkEvenOdd(3);
		object1.checkEvenOdd(7);
		object1.edward(false);
		object1.checkPerson("Teyfur");
		object1.checkPerson("Maha");
	}

}
