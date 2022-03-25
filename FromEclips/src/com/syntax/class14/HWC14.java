package com.syntax.class14;

		public class HWC14 {

		    String UsernameAndPassword(String userName, String password, String confirmPassword) {
		        if (userName.isEmpty() || password.isEmpty()) {
		        	return"Username and Password cannot be empty";
		        } else if (password.length() < 8) {
		        	return"Password is too short";
		        } else if (password.contains(userName)) {
		        	return"Password cannot contain username";
		        } else if (!password.equals(password)) {
		        	return"Password do not much";
		        } else {
		        	return "Your username and password has been created";
		    }
		}
		    public static void main(String[] args) {

		        HWC14 obj = new HWC14();  
		        System.out.println(obj.UsernameAndPassword("","", ""));
		        System.out.println(obj.UsernameAndPassword("Sac12", "Sac12", "Mac12"));
		        System.out.println(obj.UsernameAndPassword("Sayed123", "Sayed123", "SayedSac12"));
		        System.out.println(obj.UsernameAndPassword("Sac12222", "Sac12345", "Sac12333"));
		    }
		    }

