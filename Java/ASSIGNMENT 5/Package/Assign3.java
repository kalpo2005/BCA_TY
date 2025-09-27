/**
* (3) Create a package called shape inside the package define a class name as figure which 
compute the volume of cube, cylinder and rectangle using method overloading access 
this class and method from another file.   
*/

import java.util.Scanner;
import Shape.Figure;

class Assign3{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Figure kal = new Figure();
		
		System.out.print("Enter a cube leght      :");
		float A = sc.nextFloat();
		
		System.out.print("Enter a cylinder radius :");
		float B = sc.nextFloat();
		System.out.print("Enter a cylinder height :");
		float C = sc.nextFloat();
		
		System.out.print("Enter a rectangle leght :");
		float D = sc.nextFloat();
		System.out.print("Enter a rectangle width :");
		float E = sc.nextFloat();
		System.out.print("Enter a rectangle height:");
		float F = sc.nextFloat();
		
		kal.volumeFind(A);
		kal.volumeFind(B,C);
		kal.volumeFind(D,E,F);
		
	}
}