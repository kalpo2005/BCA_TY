import java.util.*;

class Assign19{
	public static void main(String[] args){
		
		//System.out.println(args.lenght);
		float number1,number2;
		
		number1 = Float.parseFloat(args[0]);
		number2 = Float.parseFloat(args[1]);
		Additon kal = new Additon();
		System.out.println("A Additon of two Number is :"+ kal.sumFind(number1,number2));
	}
}

class Additon{

	float sumFind(float number1, float number2){
		return (float) number1+number2;
	}
	
}