package com.syntax.class21;

public class DupperDemo1 {
}
	class AAA{
		AAA(){
	}
}
	class BBB extends AAA{
	String name;
		BBB(){
	}
		BBB(String name){
			super();
			// this(); we can not use this() inside the same constructor
			this.name = name;
			
			}
}
	
