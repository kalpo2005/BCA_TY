/**
* (8) Write a java code that create classes sum, div, sub. All the classes contain same 
method getvalue and discalc. Apply dynamic dispatch method mechanism. 
*/

import java.util.*;

class Sum{
	float number1,number2;
	
	void getValue(Scanner sc){
		
		System.out.println("=============== sum ================ \n");
		
		System.out.print("Enter a Number1 for sum      :");
		number1 = sc.nextFloat();
		
		System.out.print("Enter a Number2 for sum      :");
		number2 = sc.nextFloat();
		
	}
	
	void disCalculation(){
		System.out.println("A sum of the two number is   : " + (number1 + number2));
	}
}

class Substract extends Sum{
	float number1,number2;
	
	void getValue(Scanner sc){
		
		
		System.out.println("=============== Substraction ================ \n");
		System.out.print("Enter a Number1 for Substraction     :");
		number1 = sc.nextFloat();
		
		System.out.print("Enter a Number2 for Substraction     :");
		number2 = sc.nextFloat();
	}
	
	void disCalculation(){
		System.out.println("A Substraction of the two number is   : " + (number1 - number2));
	}
}

class Multiplication extends Substract{
	float number1,number2;
	
	void getValue(Scanner sc){
		
		
		System.out.println("=============== Multiplication ================ \n");
		System.out.print("Enter a Number1 for Multiplication      :");
		number1 = sc.nextFloat();
		
		System.out.print("Enter a Number2 for Multiplication      :");
		number2 = sc.nextFloat();
	}
	
	void disCalculation(){
		System.out.println("A Multiplication of the two number is   : " + (number1 * number2));
	}
}

class Division extends Multiplication{
	float number1,number2;
	
	void getValue(Scanner sc){
		
		
		System.out.println("=============== Division ================ \n");
		System.out.print("Enter a Number1 for Division       :");
		number1 = sc.nextFloat();
		
		System.out.print("Enter a Number2 for Division       :");
		number2 = sc.nextFloat();
	}
	
	void disCalculation(){
		System.out.println("A Division of the two number is   : " + (number1 / number2));
	}
}

class Assign2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Sum kal = new Sum();
		kal.getValue(sc);
		kal.disCalculation();
		
		
		kal = new Substract();
		kal.getValue(sc);
		kal.disCalculation();
		
		kal = new Multiplication();
		kal.getValue(sc);
		kal.disCalculation();
		
		kal = new Division();
		kal.getValue(sc);
		kal.disCalculation();
		
		
	}
}