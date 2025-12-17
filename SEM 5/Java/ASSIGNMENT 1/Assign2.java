import java.util.Scanner;

class Assign2{
	public static void main(String[] args){
		Operation kal = new Operation(); 
		kal.input();
		kal.result();
	}
	
}

 class Operation{
	
	int a,b;
	void input(){
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter a First Number :");
		a = sc.nextInt();
		
		System.out.print("Enter a Second Number :");
		b = sc.nextInt();
		
		sc.close();
	}
	
	void result(){
		System.out.println("A sum is a :"+(a+b));
		System.out.println("A substraction is a :"+(a-b));
		System.out.println("A multiplication is a :"+(a*b));
		System.out.println("A division is a :"+(float)a/b);
	}
	
}