package com.syntax.class13;

public class MethodsDemo2 {

	void TeyfurAndHorse(String personName, String animalName) {
		if("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a camel");
		}else if("Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a Horse");
			
		}
		}
		
	public static void main(String[] args) {
		MethodsDemo2 obj=new MethodsDemo2();
		obj.TeyfurAndHorse("Teyfur", "Horse");
		obj.TeyfurAndHorse("Tarik", "Horse");
		
		
	}
}
