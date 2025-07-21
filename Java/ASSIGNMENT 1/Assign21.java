import java.util.*;

class Assign21{
	public static void main(String[] args){
		
		//System.out.println(args.lenght);
		float number1,number2;
		
		number1 = Float.parseFloat(args[0]);
		number2 = Float.parseFloat(args[1]);
		Multiplication kal = new Multiplication();
		System.out.println("A Multiplication of two Number is :"+ kal.multiplicatonFind(number1,number2));
	}
}

class Multiplication{

	float multiplicatonFind(float number1, float number2){
		return (float) number1*number2;
	}
	
}