package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifierTester {

	private String name="Naughty Tarik"; 
	int age=50; //default access
	protected double weight=50;
	public String color="White";
	
	public static void main(String[] args) {
		
		AccessModifiers am=new AccessModifiers();
		/*
		 * Can't access name because it has private access 
		 * Can't access age because it has default access
		 * Can't access weight because it has protected access
		 * Can olny access color because it has public 
		 * access whic can be accessed from anywhere inside the same project
		 */
		//System.out.println(am.name);
		//System.out.println(am.age);
		//System.out.println(am.weight);
		System.out.println(am.color);

	}

}
