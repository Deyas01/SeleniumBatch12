package com.syntax.class10;

public class HW {

	public static void main(String[] args) {

		// Creat an array of cars and store 6 elements into it.
		// Using 2 different lops print all values from the array;
		
		String [] cars= {"Audi", "BMW","Handa","Ford","kia","Lexus",};
		// for Classic
	for(int i=0; i<cars.length; i++) {
		System.out.println(cars[i]+" ");
	}
	//For Each
	System.out.println("----------------------------New---------------------------");
	
	for (String car: cars) {
		System.out.println(car+" ");
	} 
	System.out.println("----------------------------New---------------------------");
	// Creat an arry on integers and calculatie the sum of all elements in an arry
	
	int[] numbers= {15, 45, 10, 32};
	int size= numbers.length;
	int sum=0;
	for (int i=0; i<size; i++) {
		sum +=numbers[i];
		
		System.out.println("sum of all elements in the arry ="+ sum);
	}
	System.out.println("----------------------------New---------------------------");
	
		sum=0;
		for (int num:numbers) {
			sum+=num;
			
		}
		System.out.println("sum of all elements in the arry ="+ sum);
	
	System.out.println("----------------------------New---------------------------");
	//HW number 4
	// From an array of integer elements find the largest number.
	int[] number= {15, 45, 10, 32};
	int largest=number[0];
	for (int n=0; n<number.length; n++) {
		if (number[n] > largest) {
			largest=number[n];
			
			System.out.println(largest);
		}
		
		
	}
	
	}
}
