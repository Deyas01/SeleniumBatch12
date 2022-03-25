package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {

		String	[] cities = {"WDC", "boston", "Miami", "LA", "NW"};
		 
		for(String city:cities) {
			System.out.println(city);
		}
		
		System.out.println("---------------New---------------");
		
		int[] numbers= {10, 20, 30, 40};
		 for (int num:numbers) {
			 
			 System.out.println(num);
		 }
		 System.out.println("---------------New---------------");
		 
		 char [] grades= {'A', 'B', 'C', 'D'};
		 for(char grade:grades) {
			 
			 System.out.print(grade+" ");
		 }
		}

}
