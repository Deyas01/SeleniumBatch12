package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {

for(int i=10; i<=13; i++) {
	System.out.println("Hello "+i);
}
System.out.println("-----------------MULTIPLICATION TABLE------------------------");

	int num=3;
	int result;
	for (int i=1; i<=10; i++) {
			result=num*i;
		System.out.println(num+" X "+i+" = "+result);
	}
	System.out.println("-------------------WHAT IS THE OUTPUT------------------");
	
	for (int i=0; i<=10; i+=3) {
		System.out.println(i+" ");
	}
System.out.println("-WHAT IS THE OUTPUT-");
	
int sum=0;
	for (int i=1; i<=5; i++) {
		sum+=i; 
		System.out.println(sum);
	}
	int value=1;
	for (int i=1; i<=4; i++) {
		value*=1;
		System.out.println(value);
	}
	System.out.println("-WHAT IS THE OUTPUT-");
	int summ=0;
	for (int i=1; i<=50; i++) {
		if (i%2==0) {
		summ=summ+i;
		System.out.println(summ);
		}
	System.out.println("-WHAT IS THE OUTPUT-");
		
		int sumEven=0;
		int sumOdd=0;
		for (int a=1; i<=50; i++) {
			if (i%2==0) {
			sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
			System.out.println("The sum of all even numbers = "+sumEven+" and the sum of all odd numbers = "+sumOdd);
			}
		System.out.println("--------------------------New----------------------------");
		
		for (int a=1; a<=3; a++) {
			for (int b=1; b<=3; b++) {
				System.out.println(a+" "+b);
			}
		}
	}
	}
}
