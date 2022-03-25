package com.syntax.class13;

public class Task {

	String  getproperAnimalByExpert(String expertName, String animalName) {
	    if ("Teyfur".equalsIgnoreCase(expertName) && "Horse".equalsIgnoreCase(animalName)) {
	        return "Camel";
	    } else if ("Horse".equals(animalName)){
	        return "Horse";
	    }else {
	    	return "I don't know";
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task obj=new Task();
		System.out.println(obj.getproperAnimalByExpert("Teyfur", "Horse"));
		System.out.println(obj.getproperAnimalByExpert("Tammer", "Horse"));
		System.out.println(obj.getproperAnimalByExpert("Tammer", "Monkey"));
	}

}
