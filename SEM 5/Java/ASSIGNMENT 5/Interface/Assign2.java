/**
* (2) Create an interface interarea containing two method that float area(float,float), float 
perimeter(float,float). Create two different class rectangle and circle and implements above 
two methods in this class. In main two object create rectangle and circle using new operator 
for assign them into suitable class.  
*/

import java.util.*;

interface interArea{
	float area(float a, float b);
	float perimeter(float a, float b);
}

class Ractangle implements interArea{
	public float area(float a, float b){
		return a * b;
	}
	
	public float perimeter(float a, float b){
		return 2 * (a + b);
	}
}

class Circle implements interArea{
	public float area(float a, float b){
		return 3.14f * a * a;
	}
	
	public float perimeter(float a, float b){
		return 2 * 3.14f * a;
	}
}
class Assign2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Ractangle kal = new Ractangle();
		Circle bav = new Circle();

		System.out.print("Enter a ractangle lenght  :");
		float l = sc.nextFloat();
		
		System.out.print("Enter a ractangle width   :");
		float w = sc.nextFloat();
		
		System.out.print("Enter a circle radius     :");
		float r = sc.nextFloat();
		
		System.out.println("Ractangle area is a      :" + kal.area(l,w));
		System.out.println("Ractangle perimeter is a :" + kal.perimeter(l,w));
		System.out.println("Circle area is a         :" + bav.area(r,0));
		System.out.println("Circle perimeter is a    :" + bav.perimeter(r,0));
		
	}
}
