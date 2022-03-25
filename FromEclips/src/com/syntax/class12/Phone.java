package com.syntax.class12;

public class Phone {
	String make;
	String model;
	int camera;
	String color;
	double screenSize;
	
	void highQuality() {
		System.out.println("Hight quality phnoe and works well");
	}
		
	void veryExpensive() {
	System.out.println("The phone is very expensive");	
	}
	
	void qualityPictures() {
		System.out.println("Taking a high resolution pictures");
	}
	
	void printCompleteInfo() {
		System.out.println("make: "+make);
		System.out.println("model: "+model);
		System.out.println("camera: "+camera);
		System.out.println("color: "+color);
		System.out.println("screenSize: "+screenSize);

	}
	
	public static void main(String[] args) {
		
		System.out.println("_______iPhone______");
		Phone iPhone=new Phone();
		iPhone.make="Apple";
		iPhone.model="Iphone 13 pro max";
		iPhone.camera=3;
		iPhone.color="blue";
		iPhone.screenSize=6.7;
		iPhone.highQuality();
		iPhone.veryExpensive();
		iPhone.qualityPictures();
		iPhone.printCompleteInfo();
		
		Phone Samsung=new Phone();
		System.out.println("_______Samsung______");
		Samsung.make="Samsung";
		Samsung.model="S22 ultra";
		Samsung.camera=4;
		Samsung.color = "black";
		Samsung.screenSize = 6.8;
		Samsung.highQuality();
		Samsung.qualityPictures();
		Samsung.printCompleteInfo();
		
		Phone Nokia=new Phone();
		System.out.println("_______Nokia______");
		Nokia.make="Nokia";
		Nokia.model="XR20";
		Nokia.camera=2;
		Nokia.color = "white";
		Nokia.screenSize = 6.5;
		Nokia.highQuality();
		Nokia.qualityPictures();
		Nokia.printCompleteInfo();
	}

}
