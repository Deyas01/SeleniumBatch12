package com.syntax.class18;

public class Task2 {

public static String reverseString (String input) {
	
	StringBuilder stringBuilder=new StringBuilder(input);
	//stringBuilder.reverse();
	//stringBuilder.toString();
	return new StringBuilder(input).reverse().toString();
	
}
	
	
	public static void main(String[] args) {

String name="Emili";
System.out.println(Task2.reverseString(name));

	}

}
