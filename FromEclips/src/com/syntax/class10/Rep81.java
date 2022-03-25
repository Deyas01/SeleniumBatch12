package com.syntax.class10;

public class Rep81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] number= {5,4,8};
			int largest=number[0];
			for (int n=0; n<number.length; n++) {
				if (number[n] > largest) {
					largest=number[n];
					
					System.out.println(largest);
				}
			}
			
			}
	}


