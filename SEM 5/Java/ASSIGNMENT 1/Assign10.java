import java.util.Scanner;

class Assign10{
	
	public static void main(String[] args) {
		NumberPattern kal = new NumberPattern();
		kal.takeInput();
		kal.showResult();
	}
}

class NumberPattern{
	
	int number;
	boolean isEven;
	
	void takeInput(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number1:");
		number = sc.nextInt();
		
	}
	
	void showResult(){
		
		int palindrone=0,reminder,number1=number;
		
		while(number1>0){
			
			reminder = number1%10;
			palindrone = (palindrone*10)+reminder;
			number1 = number1/10;
		}
		if(palindrone==number)
			System.out.println("Number is a palindrone :"+ number);
		else
			System.out.println("Number is not a palindrone :"+number);
		
	}
}