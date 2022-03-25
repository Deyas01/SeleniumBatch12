package com.syntax.class16;

public class StringVsStringBuilder {

	public static void main(String[] args) {

String s="Asghar Is Great";
System.out.println(s.replace(" ", ""));
System.out.println(s);


s.concat("hahah");
System.out.println(s);

StringBuilder stringBuilder=new StringBuilder("Asghar Is Great"); 
stringBuilder.append("Hahha");
System.out.println(stringBuilder);


	
	}
	}


