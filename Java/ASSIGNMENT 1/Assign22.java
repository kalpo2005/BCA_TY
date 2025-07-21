import java.util.*;

class Assign22{
	public static void main(String[] args){
		
		//System.out.println(args.lenght);
		float number1,number2;
		
		number1 = Float.parseFloat(args[0]);
		number2 = Float.parseFloat(args[1]);
		Division kal = new Division();
		System.out.println("A Multiplication of two Number is :"+ kal.divisionFind(number1,number2));
	}
}

class Division{

	float divisionFind(float number1, float number2){
		
		if(number1>number2)
		return (float) number1/number2;
	
		return (float) number2/number1;
	
	}
	
}