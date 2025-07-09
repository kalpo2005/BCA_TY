import java.util.Scanner;

class Assign7{
	
	public static void main(String[] args) {
		NumberPattern kal = new NumberPattern();
		kal.takeInput();
	}
}

class NumberPattern{
	
	int number;
	boolean isEven;
	
	void takeInput(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number for the odd and even :");
		number = sc.nextInt();
		showResult();
	}
	
	void showResult(){
		
		//number%2==0 ? isEven = true: isEven=false;
		
		if(number%2==0){
			System.out.println("Number is a even "+ number);
			return;
		}
		System.out.println("Number is a odd "+ number);
	}
}