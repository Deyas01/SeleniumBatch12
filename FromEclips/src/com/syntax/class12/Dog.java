package com.syntax.class12;

import java.util.Scanner;

public class Dog {
	//Attributes = states of the objects, fields, properties
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	// Behaviours= interaction of the objects, functions and methods
	void barks() {
		System.out.println("Dog is barking...");
	}
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[] args) {
		// Creating an object scooby from class Dog

			Dog scooby=new Dog ();
			
			//Dog i a class
			// = is an assignment operator 
			// new is keyword that we use to creat the objects of a class
			// Dog () we are calling the constructor of the class
			//Scanner scan=new Scanner(System.in);
			scooby.barks();
			scooby.eat();
			scooby.sleep();
	}

}
