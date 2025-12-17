/**
*1) Write a java program to display sum using method overloading. 
*/

import java.util.*;

class Assign1{
	
	void sum(float a, float b){
		System.out.println("A two parameter sum is    :" + (a + b));
	}
	
	void sum(float a, float b, float c){
		System.out.println("A three parameter sum is  :" + (a + b));
	}
	
	public static void main(String[] args){
		Assign1 kal = new Assign1();
		kal.sum(20.22f,300.5f);
		kal.sum(56.22f,75.5f,89.22f);
	}
}