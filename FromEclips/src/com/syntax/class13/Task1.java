package com.syntax.class13;

public class Task1 {

	void printLarger(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println("Number 1 is greater");
		}else if (num2>num1) {
			System.out.println("Number 2 is greater");
		}else {
			System.out.println("Numbers are the same");		}
	}
	// Create a method that will take 2 parameters as a numbers and prints which number is larger
	// Create a method that will take 2 parameters as a numbers and returns which number is larger
	public static void main(String[] args) {
		
		Task1 object=new Task1();
		object.printLarger(10,12);
		object.printLarger(12,10);
		object.printLarger(10,10);
	}

}