import java.util.*;

class Assign4{
	public static void main(String[] args){
		Operation kal = new Operation(); 
		kal.input();
		kal.result();
	}
	
}

 class Operation{
	
	int rate,duration,price,interest;
	void input(){
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter a price Number :");
		price = sc.nextInt();
		
		System.out.print("Enter a duration Number :");
		duration = sc.nextInt();
		
		System.out.print("Enter a rate Number :");
		rate = sc.nextInt();
		
		sc.close();
	}
	
	void result(){
		System.out.println("-----------------");
		interest= (price * rate * duration)/100;
		System.out.println("Simple interest is a :"+ interest);
	}
	
}