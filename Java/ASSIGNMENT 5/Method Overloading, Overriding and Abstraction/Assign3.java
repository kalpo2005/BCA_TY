/**
* (3) Write a java program to demonstrate the use of method Overriding in program.
*/

import java.util.*;

class OverrideDemo{
	
	void sum(float a, float b){
		System.out.println("A sum is             :" + (a + b));
	}
}

class Assign3 extends OverrideDemo{
	
	@Override
	void sum(float a, float b){
		System.out.println("A substraction is    :" + (a - b));
	}
	
	
	public static void main(String[] args){
		OverrideDemo kal = new OverrideDemo();
		Assign3 bav = new Assign3();
		System.out.println("------------ Method Overridig demo -----------------");
		kal.sum(255.33f,2656.26f);
		bav.sum(255.33f,2656.26f);
	}
}