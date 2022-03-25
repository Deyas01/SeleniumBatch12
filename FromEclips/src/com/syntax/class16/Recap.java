package com.syntax.class16;

public class Recap {

	public static void main(String[] args) {
		
	String str="This is my #0345685967 Tarik";
	    //String str="Dana";
        System.out.print(str.charAt(0));
    System.out.print(str.charAt(3));
    System.out.print(str.length());
    System.out.println(str.charAt(str.length()-1));
    System.out.println("______________________");
    
    System.out.println(str.indexOf('A'));
    System.out.println(str.indexOf('a'));
    System.out.println(str.lastIndexOf('a'));
    System.out.println("______________________");
    System.out.println(str.indexOf("#"));
    System.out.println(str.substring(str.indexOf("#")+1));
    System.out.println(str.substring(12,15));
    System.out.println(str.substring(str.indexOf("#")+1,str.indexOf("#")+1+11));

    
}
}
	