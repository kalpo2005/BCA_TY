/**
* (1) Write a java program that create three classes cricket, football and basketball. All 
these classes has same methods getpoint and dispoint methods. Now display data 
using polymorphism mechanism(Dynamic Method Dispatch).. 
*/

import java.util.*;


class Cricket{
	int numberOfPoint;
	
	void getPoint(Scanner sc){
		
		System.out.print("Enter a Cricket Team Point :");
		numberOfPoint = sc.nextInt();
	}
	
	void disPoint(){
		System.out.println("A Team Cricket Point is a  : " + numberOfPoint);
	}
}

class Football extends Cricket{
	int numberOfPoint;
	
	void getPoint(Scanner sc){
		
		System.out.print("Enter a Football Team Point :");
		numberOfPoint = sc.nextInt();
	}
	
	void disPoint(){
		System.out.println("A Team Football Point is a  : " + numberOfPoint);
	}
}

class Basketball extends Football{
	int numberOfPoint;
	
	void getPoint(Scanner sc){
		
		System.out.print("Enter a Basketball Team Point :");
		numberOfPoint = sc.nextInt();
	}
	
	void disPoint(){
		System.out.println("A Team Basketball Point is a  : " + numberOfPoint);
	}
}


class Assign1{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Cricket kal = new Cricket();
		kal.getPoint(sc);
		kal.disPoint();
		
		
		kal = new Football();
		kal.getPoint(sc);
		kal.disPoint();
		
		kal = new Basketball();
		kal.getPoint(sc);
		kal.disPoint();
		
	}
}