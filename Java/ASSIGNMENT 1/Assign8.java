import java.util.Scanner;

class Assign8{
	
	public static void main(String[] args) {
		NumberPattern kal = new NumberPattern();
		kal.takeInput();
	}
}

class NumberPattern{
	
	int number1,number2,number3;
	boolean isEven;
	
	void takeInput(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number1:");
		number1 = sc.nextInt();
		
		System.out.print("Enter a Number2:");
		number2 = sc.nextInt();
		
		System.out.print("Enter a Number3:");
		number3 = sc.nextInt();
		showResult();
	}
	
	void showResult(){
		
		//number%2==0 ? isEven = true: isEven=false;
		if((number1==number2)&&(number3==number1)){
			System.out.println("All number are same !!!!");
			return;
		}
		
		if(number1<number2 && number1<number3){
			System.out.println("Number is a bigger "+ number1);
		}
		else if(number2>number3){
			System.out.println("Number is a bigger "+ number2);
		}
		else{
			System.out.println("Number is a bigger "+ number3);
		}
	}
}