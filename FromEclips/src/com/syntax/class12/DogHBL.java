package com.syntax.class12;
public class DogHBL {
	
		String name;
		String color;
		String origin;
		int age;
		double weight;
		void isFriendly() {
			System.out.println(name+" is friendly");
		}
		void isIntelligent() {
			System.out.println(name+" is intelligent");
		}
		void isOutgoing() {
			System.out.println(name+" is outgoing");
		}
		void printCompleteInfo() {
			System.out.println("Color: "+color);
			System.out.println("Origin: "+origin);
			System.out.println("Age: "+age);
			System.out.println("Weight: "+weight);
		}
		public static void main(String[] args) {
			
			System.out.println("---Husky----");	
			DogHBL Husky=new DogHBL ();
			Husky.name="Husky";
			Husky.isIntelligent();
			Husky.color="White, Black, Grey, Red";
			Husky.origin="Siberia";
			Husky.age=15;
			Husky.weight=40;
			Husky.printCompleteInfo();
			
			System.out.println("---Bulldog----");
				
			DogHBL Bulldog=new DogHBL ();
			Bulldog.name="Bulldog";
			Bulldog.isFriendly();
			Bulldog.color="White, Fawn, Piebald, Brindle, and Red Brindle";
			Bulldog.origin="UK";
			Bulldog.age=10;
			Bulldog.weight=50;
			Bulldog.printCompleteInfo();
			
			System.out.println("---Labrador----");
			
			DogHBL Labrador=new DogHBL ();
			Labrador.name="Labrador";
			Labrador.isOutgoing();
			Labrador.color="Black, Chocolate, and Yellow";
			Labrador.origin="Newfoundland";
			Labrador.age=12;
			Labrador.weight=70;
			Labrador.printCompleteInfo();
		}
	}
