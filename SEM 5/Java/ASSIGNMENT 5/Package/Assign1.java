/**
* (1) Write a java program to demonstrate create and import package. 
*/

import java.util.Scanner;
import UtlityClasses.MyFirstPackage;

class Assign1{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MyFirstPackage kal = new MyFirstPackage();
		
		System.out.print("Enter your name  :");
		String name = sc.nextLine();
		
		kal.showMyName(name);
		
	}
}