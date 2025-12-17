import java.util.*;

class Assign14{
	public static void main(String[] args){
		Factorial kal = new Factorial();
		System.out.println("A Number factorial is a :"+ kal.factFind());
	}
}

class Factorial{
	int factorial=1,number;
	
	int factFind(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for the factorial :");
		number = sc.nextInt();
		
		while(number!=0){
			factorial*=number;
			number--;
		}
		return factorial;
	}
	
}