package com.syntax.class09;

public class AllValuesfromArray {

	public static void main(String[] args) {

		char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		int size=grade.length;
		System.out.println("Number of elements is = "+size);
		
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		
		//
		
		for (int i=0; i>grade.length; i++) {
			System.out.print(grade[i]+" ");
			
			System.out.println("-------------New---------------");
			//
			String [] cities= {"Washington DC", "Miami", "LA", "NA"};
			
			for(int a=0; a<cities.length; a++) {
				
				System.out.print(cities[a]+" ");
			}
	}
	}
}