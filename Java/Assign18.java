import java.util.*;

class Assign18{
	public static void main(String[] args){
		float height,width;
		
		height = Float.parseFloat(args[0]);
		width = Float.parseFloat(args[1]);
		Ractangle kal = new Ractangle();
		System.out.println("A Ractangle area is a :"+ kal.ractangleArea(height,width));
	}
}

class Ractangle{

	float ractangleArea(float height, float width){
		return (float)height * width;
	}
	
}