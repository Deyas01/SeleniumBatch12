package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {

		String [][] food= {
				
				{"redbull", "burger", "steak", "fries"},
				{"curry", "biriyani", "butter chicken"},
				{"noodles", "pad thai", "to yum"},
				{"pizza", "pasta"}
				
		};
		
		//iterates over every array/ row
		for(int row=0; row<food.length; row++) {
			
			//iterate over every column of specified row
			
			for (int col=0; col<food[row].length; col++) {
				
				//accessing elements
				System.out.println(food[row][col]);
			}
		}
System.out.println("ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP");
		
		for (String[] cousine:food){
			for(String f:cousine) {
				System.out.println(f+" ");
			}
			System.out.println("");
			}
		}
	}
