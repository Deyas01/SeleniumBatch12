package com.syntax.class19;

public class Book {

	/*Write a java class that will have a constructor: one with parameters
	 *  and second without any parameters. Create a separate Test class where 
	 *  you will execute both of the constructors 1 by 1.
	 */
	String name = "Java For All";
	String author= "Sayed"; 
	int page = 100;
	
	Book(String name, String author, String page){
		
		this.name=name;
		this.name=author;
		this.name=page;
		
	}
	Book(){
		
	}
	void printBook() {
		String name="Java For All";
		System.out.println(page);
		
}
}

