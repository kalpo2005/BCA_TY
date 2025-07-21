import java.util.Scanner;

class Assign9{
	
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
		
		int armstrong=0,reminder,number1=number;
		
		while(number1>0){
			
			reminder = number1%10;
			armstrong = (reminder * reminder *reminder)+armstrong;
			number1 = number1/10;
		}
		if(armstrong==number)
			System.out.println("Number is a armstong :"+ number);
		else
			System.out.println("Number is not a armstrong :"+number);
		
	}
}