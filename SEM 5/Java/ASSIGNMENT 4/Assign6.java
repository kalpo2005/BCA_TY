/**
*Write a java program to student record using multi level inherince
*/

import java.util.*;

class Student{
	int rno;	
	String name;	
}

class Marks extends Student{
	
	int mark1,mark2,mark3;
	
	void getData(Scanner sc){
		
		System.out.println("\n---------------- Enter student information -------------------");
		 
		System.out.print("Enter a student no       : ");
		rno = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a student name     : ");
		name = sc.nextLine();
		
		System.out.print("Enter a subject 1 marks   : ");
		mark1 = sc.nextInt();
		
		System.out.print("Enter a subject 2 marks   : ");
		mark2 = sc.nextInt();
		
		System.out.print("Enter a subject 3 marks   : ");
		mark3 = sc.nextInt();
		
	}
}

class Result extends Marks {

	float total,percentage;

	
	void display(){
		
		System.out.println("\n---------------- student information -------------------");
		
		System.out.println("student rno        : " + rno);
		System.out.println("student name       : " + name);
		System.out.println(" subject 1 marks   : " + mark1);
		System.out.println(" subject 2 marks   : " + mark2);
		System.out.println(" subject 3 marks   : " + mark3);
		System.out.println(" Total marks is    : " + total);
		System.out.println(" Percentage is     : " + percentage + "%");
	}
	
	void calculateResult(){
		total = mark1 + mark2 + mark3;
		percentage = (total*100)/300;
	}
}

class Assign6{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		Result kal = new Result();
		kal.getData(sc);
		kal.calculateResult();
		kal.display();
	}
}
