import java.util.Scanner;
import java.util.*;

class Rectangle{
	
	float area,perimeter;
	float height,widht;
	
	Rectangle(float height,float widht){
		this.height = height;
		this.widht = widht;
	}
	
	void calculateArea(){
		area = height * widht;
	}
	
	void calculatePerimeter(){
		perimeter = 2 * (height + widht);
	}
	
	void showData(){
		System.out.println("\nRactangle data is a !!!");
		System.out.println("Ractangle area is        : " + area);
		System.out.println("Ractangle parimeter is   : " + perimeter);
	}
        
}

class Assign7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a rectangle height  : ");
		float height = sc.nextFloat();
		
		System.out.print("Enter a rectangle widht   : ");
		float widht = sc.nextFloat();
		
		// call the object 
		Rectangle kal = new Rectangle(height,widht);
		kal.calculateArea();
		kal.calculatePerimeter();
		kal.showData();
        
    }

}
