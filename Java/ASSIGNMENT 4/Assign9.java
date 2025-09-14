/**
* Write a program in java that use hierarchical inheritance and use method for get and 
display detail as per given class information.Define the class for vehicle with color and name of company 
as data members. Define two other classes for car and bike, which 
inherits the data members of the class vehicle and has a member 
for the price. Get the details from the user and display it.  
*/

import java.util.*;

class Vehicle{
	String color,companyName;
	
}

class Car extends Vehicle{
	float price;
	
		void getData(Scanner sc){
		
		System.out.println("\n------------ Enter a Vehicle  Detail for car ---------");
		
		System.out.print("Enter a car color       : ");
		color = sc.nextLine();
		
		System.out.print("Enter a compnay name    : ");
		companyName = sc.nextLine();
		
		System.out.print("Enter a Vehicle Price   : ");
		price = sc.nextFloat();
		sc.nextLine();	
	}
	
	void display(){
		
		System.out.println("\n------------ Vehicle  Detail is below for car ---------\n");
		
		System.out.println("Vehicle Color is        : "+ color);
		System.out.println("Vehicle company Name    : "+ companyName);	
		System.out.println("Vehicle price is        :"+  price);
		
	}
}

class Bike extends Vehicle{
	float price;
	
	void getData(Scanner sc){
		
		System.out.println("\n------------ Enter a Vehicle  Detail for Bike ---------");
		
		System.out.print("Enter a bike color       : ");
		color = sc.nextLine();
		
		System.out.print("Enter a compnay name     : ");
		companyName = sc.nextLine();
		
		System.out.print("Enter a Vehicle Price    : ");
		price = sc.nextFloat();
		sc.nextLine();	
	}
	
	void display(){
		
		System.out.println("\n------------ Vehicle  Detail is below for bike ---------\n");
		
		System.out.println("Vehicle Color is        : "+ color);
		System.out.println("Vehicle company Name    : "+ companyName);	
		System.out.println("Vehicle price is        :"+  price);
		
	}
}

class Assign9{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
			
			Car C = new Car();
			Bike B = new Bike();
			
			C.getData(sc);
			B.getData(sc);
			
			C.display();
			B.display();
	}
}
