/**
* (1) Define an floaterface addsub with two method void addition(float,float), void subtraction(float,float) 
and another floaterface muldiv with two method void multiply(float,float), and void 
devision(float,float) extends first floaterface floato second floaterface and implements the floaterface floato 
suitable class. 
*/

import java.util.*;

interface addSub{
	void addition(float a, float b);
	void subtraction(float a, float b);
}

interface mulDiv{
	void multiply(float a, float b);
	void devision(float a, float b);
}


class InterfaceDemo implements addSub,  mulDiv{
	
	public void addition(float a, float b){
		System.out.println(" A Sum is a          : "+ (a+b));
	}
	
	public void subtraction(float a, float b){
		System.out.println(" A subtraction is a  : "+ (a-b));
	}
	
	public void multiply(float a, float b){
		System.out.println(" A multiply is a     : "+ (a*b));
	}
	
	public void devision(float a, float b){
		System.out.println(" A devision is a     : "+ (a/b));
	}
}

class Assign1{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		InterfaceDemo kal = new InterfaceDemo();

		System.out.print("Enter first number for operation  :");
		float m = sc.nextFloat();
		
		System.out.print("Enter second number for operation :");
		float n = sc.nextFloat();
		
		kal.addition(m,n); // Sum
		kal.subtraction(m,n); // subtraction
		kal.multiply(m,n); // multiply
		kal.devision(m,n); // devision
		
	}
}
