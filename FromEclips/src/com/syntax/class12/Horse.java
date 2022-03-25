package com.syntax.class12;

public class Horse {
	
	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name+" is running");
	}
	void eat() {
		System.out.println(name+" is eating");
	}
	void printCompleteInfo() {
		System.out.println("name = "+name);
		System.out.println("breed = "+breed);
		System.out.println("age = "+age);
		System.out.println("weight = "+weight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Horse lillyHorse= new Horse();
		//accessing the property name on object lillyHorse and setting its value
		//instantiating = creating
		//instances= objects
		lillyHorse.name="spirit";
		lillyHorse.breed="stallion";
		lillyHorse.age=20;
		lillyHorse.weight=400;
		lillyHorse.run();
				
		lillyHorse.printCompleteInfo();
				
			
	}

}
