package com.syntax.class13;

public class HWN1 {

	void largest (int value1, int value2) {
		if(value1>=value2) {
			System.out.println(value1);
		}else {
			System.out.println(value2);
		}
	
	}

	public static void main(String[] args) {
	HWN1 obj=new HWN1();
	obj.largest(100, 200);
			
	}
	
}
