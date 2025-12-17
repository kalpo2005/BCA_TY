/**
* 4) Write a java programing code for demonstrate the use of Hybrid Inheritance using 
interface.  
*/

import java.util.*;

interface addSub{
	void addition(float a, float b);
}

interface mulDiv{
	void multiply(float a, float b);
}


class InterfaceDemo implements addSub,  mulDiv{
	
	public void addition(float a, float b){
		System.out.println(" A Sum is a          : "+ (a+b));
	}
	
	public void multiply(float a, float b){
		System.out.println(" A multiply is a     : "+ (a*b));
	}
}

class Assign4 extends  InterfaceDemo{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Assign4 kal = new Assign4();

		System.out.print("Enter first number for operation  :");
		float m = sc.nextFloat();
		
		System.out.print("Enter second number for operation :");
		float n = sc.nextFloat();
		
		kal.addition(m,n); // Sum
		kal.multiply(m,n); // multiply
		
	}
}
