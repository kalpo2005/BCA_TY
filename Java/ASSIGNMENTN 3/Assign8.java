import java.util.Scanner;
import java.util.*;

class Rectangle{
	
	float height,widht;
	
	Rectangle(float height,float widht){
		System.out.println("\nValue assign to the class properties using the this keyword  !!!");
		this.height = height;
		this.widht = widht;
	}
	
	void showData(){
		System.out.println("\nClass properties show !!!");
		System.out.println("Ractangle height is  : " + height);
		System.out.println("Ractangle widht is   : " + widht);
	}
        
}

class Assign8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a rectangle height  : ");
		float height = sc.nextFloat();
		
		System.out.print("Enter a rectangle widht   : ");
		float widht = sc.nextFloat();
		
		// call the object 
		Rectangle kal = new Rectangle(height,widht);
		kal.showData();
        
    }

}
