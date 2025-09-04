/**
* Write a program in java that use  method overridding  
*/

import java.util.*;

class Shape{

	String shapeName;
	
	protected void draw(){
		System.out.println("Shape class draw method !!!");
	}
	
}

class Circle extends Shape{
	
	void getData(Scanner sc, String shape){
		
		System.out.println("\n------------ Enter a Detail for "+ shape +"---------");
		System.out.print("Enter shape name        : ");
		shapeName = sc.nextLine();
	}
	@Override
	public void draw(){
		System.out.println("A shape name is a :"+ shapeName);
	}
	
}

class Ractangle extends Shape{
	void getData(Scanner sc, String shape){
		
		System.out.println("\n------------ Enter a Detail for "+ shape +"---------");
		System.out.print("Enter shape name        : ");
		shapeName = sc.nextLine();
	}
	
	@Override
	public void draw(){
		System.out.println("A shape name is a :"+ shapeName);
	}
}

class Triangle extends Shape{
	void getData(Scanner sc, String shape){
		
		System.out.println("\n------------ Enter a Detail for "+ shape +"---------");
		System.out.print("Enter shape name        : ");
		shapeName = sc.nextLine();
	}
	
	@Override
	public void draw(){
		System.out.println("A shape name is a :"+ shapeName);
	}
}

class Assign7{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		
		Circle kal = new Circle();
		kal.getData(sc, "Circle");
		
		Ractangle M = new Ractangle();
		M.getData(sc,"Ractangle");
		
		Triangle B = new Triangle();
		B.getData(sc,"Triangle");
		
		kal.draw();
		B.draw();
		M.draw();
	}
}
