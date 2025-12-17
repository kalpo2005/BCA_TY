/**
* 5) Write a java program to calculate simple interest using abstract class. 
*/

import java.util.*;

 abstract class SimpleInterest{
	
	abstract void calculateInterest(float price, float duration, float interestRate);
}

class Assign5 extends SimpleInterest{

	void calculateInterest(float price, float duration, float interestRate){
		System.out.println("A Price is a        :" + price);
		System.out.println("A duration is a     :" +duration);
		System.out.println("A Price is a        :" +interestRate + "%" );
		System.out.println("A Simple Interest is:" + (price * duration * interestRate /100));
		System.out.println("A Net Price         :" + ((price * duration * interestRate /100)+price));
	}
	
	
	public static void main(String[] args){
		Assign5 kal = new Assign5();
		System.out.println("------------Abstract Method demo -----------------");
		kal.calculateInterest(10000.100f,1,2);
	}
}