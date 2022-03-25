package com.syntaclass5;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
Scanner grade=new Scanner(System.in);	
	double quiz, mid, finals;
		System.out.println("Enter quiz score");
		quiz=grade.nextDouble();
		System.out.println("Enter mid score");
		mid=grade.nextDouble();
		System.out.println("Enter final score");
		finals=grade.nextDouble();
		double averageSc=(quiz+mid+finals)/3;
		if (averageSc>=90) {
			System.out.println("grade A");	
	}else if (averageSc>=70 && averageSc<=90) {
			System.out.println("grade B");
	}else if (averageSc>=50 && averageSc<=70) {
			System.out.println("grade C");
		}else if (averageSc>=50) {
			System.out.println("grade F");
		
		}
}
}