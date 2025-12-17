import java.util.Scanner;
import java.util.*;

class Interest{
	float rate,price,time,simpleInterest;
        Interest(float price,float rate, float time){
			this.price = price;
			this.rate = rate;
			this.time = time;
		}
		
		void calculateSimpleInterest(){
			simpleInterest = (price*rate*time)/100;
		}
		
		void showData(){
			System.out.println("Simple interest is   	: " + simpleInterest);
		}
}

class Assign5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a price ammount       : ");
		float price = sc.nextFloat();
		
		System.out.print("Enter a interest rate       : ");
		float rate = sc.nextFloat();
		
		System.out.print("Enter a duration of time    : ");
		float time = sc.nextFloat();
		
		// call the object 
		Interest kal = new Interest(price,rate,time);
		kal.calculateSimpleInterest();
		kal.showData();
        
    }

}
