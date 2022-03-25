package com.syntax.class06;

import java.util.Scanner;
public class HW3_C6 {
	public static void main(String[] args) {
		
	Scanner shopping=new Scanner(System.in);
		System.out.println("Is the item on sale?");
		String sale=shopping.next();
	if(sale.equalsIgnoreCase("Yes")) {
		System.out.println("What is the price of the item?");
	int price=shopping.nextInt();
	double percent;
	if(price<20) {
		percent=0.1;
	}else if (price>20 && price <100) {
		percent=0.2;
	}else if (price>100 && price <500) {
		percent=0.3;
	}else {
		percent=0.5;
		}
	double discount=percent*100; 
	double finalPrice=price-discount;
	
	System.out.println("After a "+discount+" % discount, the"
			+ " price of the item reduced from $"+price+
			" to $" +finalPrice);

		
	}
	}
		
		
	}

