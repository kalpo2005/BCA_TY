/**
* (2) Write a package code arithmetic that contains method to deal all arithmetic operation 
also write a program to used the package.  
*/

import java.util.Scanner;
import UtlityClasses.AithematicOperation;

class Assign2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		AithematicOperation kal = new AithematicOperation();
		
		System.out.print("Enter first number for the operation :");
		float A = sc.nextFloat();
		
		System.out.print("Enter Second number for the operation :");
		float B = sc.nextFloat();
		
		kal.opeataions(A,B);
		
	}
}