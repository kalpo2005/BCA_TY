/**
* (2) Define a class series with overloaded method to print Fibonacci series. This class 
must contain following types of method. 
(1) Void fibona() : It will print 10 terms of the series. 
(2) Void fibona(int term) : It will print total N terms specified by term parameter. 
(3) Write a java program to demonstrate the use of method Overriding in program.
*/

import java.util.*;

class Series{
	
	void fibona(){
		int terms = 10;
		int a = 1, b = 0, c = 0;
		
		System.out.println("Fibo series terms:"+terms);
		for(int i = 1; i <= terms;i++){
			
			System.out.println(" " + c + ",");
			c = a + b;
			a = b;
			b = c;
		}
	}
	
	void fibona(int terms){
		int a = 1, b = 0, c = 0;
			System.out.println("Fibo series terms:"+terms);
		for(int i = 1; i <= terms;i++){
			
			System.out.println(" " + c + ",");
			c = a + b;
			a = b;
			b = c;
		}
	}
}

class Assign2{
	
	void sum(float a, float b){
		System.out.println("A two parameter sum is    :" + (a + b));
	}
	
	void sum(float a, float b, float c){
		System.out.println("A three parameter sum is  :" + (a + b));
	}
	
	public static void main(String[] args){
		Series kal = new Series();
		kal.fibona();
		kal.fibona(25);
	}
}