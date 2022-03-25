package com.syntax.class06;

public class switchDemo2 {

	public static void main(String[] args) {
		char choice='l';
		String answer;
		
		switch (choice) {
		case 'y':
			answer="Yes";
			break;
		case 'n':
		answer="No";
			break;	
		case 'm':
		answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
		
		System.out.println("____________________________"); 
		
		String car="BMW";
		String country;
		switch(car) {
		case "BMW":
			country="Germany";
			break;
		case "Ford":
			country="USA";
			break;
		case "Lada":
		country="Russia";
		case "Toyota":
		country="Japan";
		break;
		default:
			country="Unknown";
			
			
			
		}
		
		System.out.println(car +" is from "+country);
		}
		
		}

