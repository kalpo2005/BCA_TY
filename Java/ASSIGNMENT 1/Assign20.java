import java.util.*;

class Assign20{
	public static void main(String[] args){
		
		//System.out.println(args.lenght);
		float number1,number2;
		
		number1 = Float.parseFloat(args[0]);
		number2 = Float.parseFloat(args[1]);
		Substraction kal = new Substraction();
		System.out.println("A Substraction of two Number is :"+ kal.substractonFind(number1,number2));
	}
}

class Substraction{

	float substractonFind(float number1, float number2){
		return (float) number1-number2;
	}
	
}