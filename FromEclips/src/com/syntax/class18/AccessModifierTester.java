package com.syntax.class18;

public class AccessModifierTester {

	private String name="Naughty Tarik"; 
	int age=50; //default access
	protected double weight=50;
	public String color="White";
	
	public static void main(String[] args) {
		
		AccessModifiers am=new AccessModifiers();
		/*
		 * Can't access as name has private access
		 * 
		 */
		//System.out.println(am.name);
		System.out.println(am.age);
		System.out.println(am.weight);
		System.out.println(am.color);

	}

}
