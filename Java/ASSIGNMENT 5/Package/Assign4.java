/**
* (4) Create a package vehicle which will have 2 classes 2-Wheeler and 4-Wheeler. 2 Wheeler with method show(CC,price). 4-Wheeler with method show(regno, 
regyear).  
*/

import java.util.Scanner;
import Vehicle.TwoWheeler;
import Vehicle.FourWheeler;

class Assign4{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TwoWheeler kal = new TwoWheeler();
		FourWheeler bav = new FourWheeler();
		
		System.out.print("Ennter a 2 Wheeler engine cc :");
		float cc = sc.nextFloat();
		System.out.print("Enter a 2 Wheeler Price      :");
		float price = sc.nextFloat();
		
		System.out.print("Ennter a 4 Wheeler regno     :");
		float regno = sc.nextFloat();
		System.out.print("Ennter a 4 Wheeler regyear   :");
		int regyear = sc.nextInt();
		
		
		kal.show(cc,price);
		bav.show(regno,regyear);
		
	}
}