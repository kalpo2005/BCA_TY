/**
*  (6) Write a java program that has class shape which include that abstract method name 
getarea(). Class rectangle, triangle and circle inherit the class shape and implements 
method getarea and return value of area respectively. 
*/

import java.util.*;

 abstract class Shape{
	 
	abstract void getaArea(Scanner sc);
	
}

class Ractangle extends Shape{
	float lenght,width;
	
	void getaArea(Scanner sc){
		
		System.out.print("Enter a Ractangle lenght :");
		lenght = sc.nextFloat();
		
		System.out.print("Enter a Ractangle width  :");
		width = sc.nextFloat();
		
		System.out.println("Ractangle Area is        :"+ (lenght * width));
		
	}
}

class Triangle extends Shape{
		float base,height;
	
	void getaArea(Scanner sc){
		System.out.print("Enter a Triangle Base   :");
		base = sc.nextFloat();
		
		System.out.print("Enter a Triangle height :");
		height = sc.nextFloat();
		
		System.out.println("Triangle area is        :"+ (base * height)/2);
		
	}
}

class Circle extends Shape{
	
	float radius;
	void getaArea(Scanner sc){
		System.out.print("Enter a cirlce radius :");
		radius = sc.nextFloat();
		
		System.out.println("Circle area is        :"+ (radius * radius * 3.14f));
	}
}

class Assign6{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Ractangle R = new Ractangle();
		Triangle T = new Triangle();
		Circle C = new Circle();
		
		R.getaArea(sc);
		T.getaArea(sc);
		C.getaArea(sc);
		
	}
}