package com.syntax.class09;

public class ArryIntro {

	public static void main(String[] args) {
		
		
		int[] numbers=new int[4];
		
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;		
		numbers[3]=99;
		
		System.out.println (numbers [3]);
		System.out.println (numbers [3] +numbers[0]);
		

	// I want to creat an arry of countries 
		System.out.println("--------------New------------");
	
	String [] countries=new String[5];
	
	countries [0]="USA";
	countries [1]="Canada";
	countries [2]="Afghanistan";
	countries [3]="Molova";
	countries [4]="Morocco";
	
	System.out.println(countries[3]);
	
	System.out.println("--------------New------------");
	
	String [] names=new String[5];
	names [1]="Bob";
	names [2]="Gulnar";
	names [3]="Zakirullah";
	
	System.out.println(names[1]);
	System.out.println("Value in index 0 is ="+names[0]);
	
	names[1]="Daniyar";
	System.out.println(names[1]);
	
	System.out.println("--------------New------------");
	
	// Creat an array to store 4 different prices
	// find an average of how much we spent
	
	double [] price=new double [4];
	price[0]=0.99;
	price[1]=1.99;
	price[2]=2.99;
	price[3]=3.99;
	
	double avg=(price[0]+price[1]+price[2]+price[3])/4;
	System.out.println(avg);
	
	}
}