import java.util.Scanner;
import java.util.*;

class SwapNumber{
	int number1,number2;
	
	void getData(Scanner sc){
		
		System.out.print("Enter Number 1   : ");
		number1 = sc.nextInt();
		
		System.out.print("Enter Number 2   : ");
		number2 = sc.nextInt();
	}
	
	void showData(){
		
		System.out.println(" Number 1 is : " + number1);
		System.out.println(" Number 2 is : " + number2);
	}
	
	void swapNumber(){
		number1+=number2;
		number2=number1-number2;
		number1=number1-number2;
	}
}

class Assign2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        	SwapNumber kal = new SwapNumber();
			kal.getData(sc);
			System.out.println(" Before the swap !!! ");
			kal.showData();
			kal.swapNumber();
			System.out.println(" After the swap !!! ");
			kal.showData();
    }

}
