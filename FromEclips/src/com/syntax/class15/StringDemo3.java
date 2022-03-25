package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {

		String name="How @you @guys @";
		System.out.println(name.indexOf("@"));
		System.out.println(name.indexOf("%"));
		
		//advance we can ignore it for now
		System.out.println(name.indexOf("@", 8+1));
		System.out.println(name.indexOf("@", name.indexOf("@")+1));
	}
	}

