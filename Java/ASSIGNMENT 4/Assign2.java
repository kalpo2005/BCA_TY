/**
* Write a java code that define class student with rno, name, mark1, mark2, mark3 
and another class result with total and percentage and define a method to display 
this value.
*/

import java.util.*;

class Result{
	float total,percentage;	
}

class Student extends Result{
	int rollNo,mark1,mark2,mark3;
	String studentName;

	void getData(Scanner sc){
		
		System.out.print("Enter a Student roll no: ");
		rollNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a Student name: ");
		studentName = sc.nextLine();
		
		System.out.print("Enter a subject 1 marks : ");
		mark1 = sc.nextInt();
		
		System.out.print("Enter a subject 1 marks : ");
		mark2 = sc.nextInt();
		
		System.out.print("Enter a subject 1 marks : ");
		mark3 = sc.nextInt();
		
	}
	
	void getResult(){
		total = mark1 + mark2 + mark3;
		percentage = (total*100)/300;
	}
	
	void display(){
		
		System.out.println("---------------- Student Result is -------------------");
		System.out.println("Student roll no         : " + rollNo);
		System.out.println("Student name            : " + studentName);
		System.out.println("Student subject 1 marks : " + mark1);
		System.out.println("Student subject 2 marks : " + mark2);
		System.out.println("Student subject 3 marks : " + mark3);
		System.out.println("Student total is a      : " + total);
		System.out.println("percentage is a         : " + percentage);
	}
}

class Assign2{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		Student kal = new Student();
		kal.getData(sc);
		kal.getResult();
		kal.display();
	}
}
