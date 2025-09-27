/**
* (5) Create a package TYBCA which will have 2 classes as class mathematics with 
methods to add 2 numbers and 3 float numbers and class Maximum with a method to 
find the maximum of 2 nos.  
*/

import java.util.Scanner;
import TyBca.Mathematics;
import TyBca.Maximum;

class Assign5{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Mathematics kal = new Mathematics();
		Maximum bav = new Maximum();
		
		System.out.print("Enter a No 1 for Additon  :");
		float a = sc.nextFloat();
		System.out.print("Enter a No 2 for Additon  :");
		float b = sc.nextFloat();
		System.out.print("Enter a No 3 for Additon  :");
		float c = sc.nextFloat();
		
		System.out.print("Enter a No 1 for max find :");
		float m = sc.nextFloat();
		System.out.print("Enter a No 2 for max find :");
		float n = sc.nextFloat();
		
		System.out.println("A sum of 2 num is(" + a + "," + b  + ") number is     :"+ kal.add(a,b));
		System.out.println("A sum of 3 num is(" + a + "," + b + ","+ c + ") number is :" + kal.add(a,b,c));
		System.out.println("A maximum number is                      :" + bav.findMax(m,n));
	
	}
}