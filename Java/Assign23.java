import java.util.*;

class Assign23{
	public static void main(String[] args){
		
		float price,rate,duration;
		
		price = Float.parseFloat(args[0]);
		rate = Float.parseFloat(args[1]);
		duration = Float.parseFloat(args[2]);
		SimpleInterest kal = new SimpleInterest();
		kal.intrestFind(price,rate,duration);
	}
}

class SimpleInterest{

	void intrestFind(float price, float rate , float duration){
		float simpleInterest = (price*rate*duration)/100;
		System.out.println("A simple interest is a :"+ simpleInterest);
		System.out.println("A Total amount is a :"+ (price + simpleInterest));
	}
	
}