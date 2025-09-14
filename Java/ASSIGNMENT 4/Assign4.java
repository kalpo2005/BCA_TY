/**
*Write a java code to enter data of various cars and display it using multi-level 
inheritance. Class first (car_name, model) Class second(car_no, year) Class 
third(getdata(), putdata())
*/

import java.util.*;

class Car{
	String carName,model;	
}

class CarDetail extends Car{
	int carNo,year;
}

class CarInfo extends CarDetail {

	void getData(Scanner sc){
		
		System.out.print("Enter a car no     : ");
		carNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a car name   : ");
		carName = sc.nextLine();
		
		System.out.print("Enter a car model  : ");
		model = sc.nextLine();
		
		System.out.print("Enter a car year   : ");
		year = sc.nextInt();
	
	}
	
	void putData(){
		
		System.out.println("---------------- Car information -------------------");
		System.out.println("Car no        : " + carNo);
		System.out.println("Car name      : " + carName);
		System.out.println("Car model     : " + model);
		System.out.println("Car year      : " + year);
	}
}

class Assign4{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		CarInfo kal = new CarInfo();
		kal.getData(sc);
		kal.putData();
	}
}
