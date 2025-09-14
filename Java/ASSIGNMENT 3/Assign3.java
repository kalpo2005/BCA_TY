import java.util.Scanner;
import java.util.*;

class Student{
	int rollno;
	float mark1,mark2,mark3,total,percentage;
	String name;
	
	
	void getData(Scanner sc){
		
		System.out.print("Enter a roll number   : ");
		rollno = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" Enter a student name   : ");
		name = sc.nextLine();
		
		System.out.print("Enter subject mark 1   : ");
		mark1 = sc.nextFloat();
		
		System.out.print("Enter subject mark 2   : ");
		mark2 = sc.nextFloat();
		
		System.out.print("Enter subject mark 3   : ");
		mark3 = sc.nextFloat();
	}
	
	void resultProcess(){
		total = mark1 + mark2 + mark3;
		percentage = (total * 100)/300;
	}
	
	void showData(){
		
			System.out.println(" \nStudent Detail is a : \n");
		
		System.out.println(" Student Roll Number is  : " + rollno);
		
		System.out.println(" Student name is  : " + name);
		
		System.out.println(" Student Subject 1 marks is  : " + mark1);
		
		System.out.println(" Student Subject 2 marks is  : " + mark2);
		
		System.out.println(" Student Subject 3 marks is  : " + mark3);
		
		System.out.println(" Student total marks is  : " + total);
		
		System.out.println(" Student percentage is  : " + percentage +"%");
	
	}
        
}

class Assign3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		//make a object
		Student kal = new Student();
		kal.getData(sc);
		kal.resultProcess();
		kal.showData();
    }

}
