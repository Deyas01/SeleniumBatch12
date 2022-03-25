package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {

		String name="      Moree   d   ";
		System.out.println(name);
		System.out.println(name.trim());
		
		System.out.println("-------------------");
		
		String name2="Run Moreed";// A person who always fear his waife and is wife
		System.out.println(name2.toLowerCase().startsWith("Run")); // method chaining
		System.out.println(name2.startsWith("Moreed"));
		System.out.println(name2.endsWith("Moreed"));
		System.out.println(name2.endsWith("d"));
		System.out.println(name2.contains("M"));
	}

}
