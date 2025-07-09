import java.util.*;

class Assign17{
	public static void main(String[] args){
		float radius = Float.parseFloat(args[0]);
		Cirlce kal = new Cirlce();
		System.out.println("A Circle area is a :"+ kal.circleArea(radius));
	}
}

class Cirlce{

	float circleArea(float radius){
		return (float)3.14 * radius * radius ;
	}
	
}