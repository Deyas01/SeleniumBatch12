package com.syntax.class06;

public class swithIntro {

	public static void main(String[] args) {
int day=1;

String dayName;

if (day==5) {
	dayName="Monday";
	}else if (day==1) {
		dayName="Monday";
	}else if (day==2) {
		dayName="Tuesday";
	}else if (day==3) {
		dayName="Wednesday";
	}else if (day==4) {
		dayName="Thrusday";
	}else if (day==5) {
		dayName="Friday";
	}else if (day==6) {
		dayName="Saturday";
	}else if (day==7) {
		dayName="Sunday";
	}else {
		dayName="Invalid";
		
		System.out.println(dayName);
		
		System.out.println("________________________");
		
switch (day){

	case 1:
		dayName="Monday";
		break;
	case 2:
		dayName="Tuesday";
	case 3:
		dayName="Wedneday";
	case 4:
		dayName="Thurday";
		
	case 5:
		dayName="Friday";	
	case 6:
		dayName="Saturday";
	case 7:
		dayName="Sunday";
	default:
		dayName="Invalid";
		break;
	
} 
System.out.println(dayName);
}
}
}
