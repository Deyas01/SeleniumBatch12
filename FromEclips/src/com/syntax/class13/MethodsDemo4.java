package com.syntax.class13;

public class MethodsDemo4 {

	
// create a method that takes a boolean isSaleOn double price discount
// if isSaleOn=true return discounted price otherwise return original price
	
	double checkDiscount(boolean isSaleOn, double originalPrice,double discount) {
		if(isSaleOn) {
			return originalPrice*discount;
		
		}else {  
			return originalPrice;
		}
	}
		void methodWithOutParamters() {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MethodsDemo4 obj=new MethodsDemo4();
 System.out.println(obj.checkDiscount(false, 100, .15));
 System.out.println(obj.checkDiscount(true, 100, .15));
	}

}
