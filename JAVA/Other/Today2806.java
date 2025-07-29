import java.util.Scanner;
class Today2806{

	public static void main(String[] args){

		
		Student kal = new Student();
		kal.result();
	}

}

class Student{
	
	int number_1=20,number_2=10;
	
	public void result(){
		System.out.println("Sum is "+(number_1+number_2));	
		System.out.println("Substraction is "+(number_1-number_2));	
		System.out.println("Multiplicaton is "+(number_1*number_2));	
		System.out.println("Division is "+(number_1/number_2));
	}
}