import java.util.*;

class Assign5{
	public static void main(String[] args){
		
		//System.out.println(args.lenght);
		float number1,number2;
		
		number1 = Float.parseFloat(args[0]);
		number2 = Float.parseFloat(args[1]);
		Calculator kal = new Calculator(number1,number2);
		kal.calculate();
	}
}

class Calculator{
	
	float number1,number2;
	
	Calculator(float m, float n){
		number1 = m;
		number2 = n;
	}
	
	void calculate(){
		System.out.println("A Additon is a :"+ (number1+number2));
		System.out.println("A subsracton is a :" +(number1-number2));
		System.out.println("A Multiplicaton is a :" + (number1*number2));
		System.out.println("A divison is a :" + (number1/number2));
	}
	
}