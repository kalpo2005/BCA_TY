import java.util.Scanner;
import java.util.*;

class Assign24{
	public static void main(String[] args){
		Operation kal = new Operation(); 
		kal.input();
	}
	
}

 class Operation{
	
	int a,b,choice;
	int ch;
	Scanner sc = new Scanner(System.in);
	void input(){
		do{	
			System.out.print("Enter a First Number :");
			a = sc.nextInt();
		
			System.out.print("Enter a Second Number :");
			b = sc.nextInt();
		
			System.out.println("Enter a your choice ....");
			System.out.println("1. Additon \n 2.Substraction \n 3. Multiplication \n 4. Division");
			choice = sc.nextInt();
			
			//if(choice <=1 && choice>=5)
			//	break;
			
			switch(choice){
				case 1 :System.out.println("A sum is a  :"+(a+b));
						break;
						
				case 2 :System.out.println("A difereance is a  :"+(a-b));
						break;
						
				case 3 :System.out.println("A Multiplication is a  :"+(a*b));
						break;
						
				case 4 :System.out.println("A division is a  :"+(float)a/b);
						break;
						
				default :System.out.println("Invalid choice !!!");
						break;
			}
			
			System.out.print("Do you want a continue .....\n 01. yes  :");
			ch = sc.nextInt();
		}while(ch==1);		
		sc.close();
	}
	
}