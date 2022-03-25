package com.syntax.class17;


import com.syntax.class17.SyntaxEmployee;

public class Students {

		/*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/

		String studentName;
		String studentID;
		static int numberOfStudents=40;
		
		public static void main(String[] args) {

				Students studentObject01=new Students();
				studentObject01.studentName="Sayed";
				studentObject01.studentID="12345";
				System.out.println(studentObject01.studentName);
				System.out.println(studentObject01.studentID);
				System.out.println(studentObject01.numberOfStudents);

				Students studentObject02=new Students();
				studentObject02.studentName="Bob";
				studentObject02.studentID="12233";
				System.out.println(studentObject02.studentName);
				System.out.println(studentObject02.studentID);
				System.out.println(studentObject02.numberOfStudents=60);
				
				Students studentObject03=new Students();
				studentObject03.studentName="Jon";
				studentObject03.studentID="11223";
				System.out.println(studentObject03.studentName);
				System.out.println(studentObject03.studentID);
				System.out.println(studentObject03.numberOfStudents=80);
	}
	}