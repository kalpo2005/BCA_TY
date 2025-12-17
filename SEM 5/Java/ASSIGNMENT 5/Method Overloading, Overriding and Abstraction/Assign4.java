/**
* 4) Write a java program to demonstrate the use of abstract class. 
*/

import java.util.*;

 abstract class AbstaractDemo{
	
	abstract void sum(float a, float b);
}

class Assign4 extends AbstaractDemo{
	

	void sum(float a, float b){
		System.out.println("A substraction is    :" + (a - b));
	}
	
	
	public static void main(String[] args){
		Assign4 bav = new Assign4();
		System.out.println("------------Abstract Method demo -----------------");
		bav.sum(255.33f,2656.26f);
	}
}