import java.util.Scanner;
import java.util.*;

class Assign2{
	public static void main(String[] args){
		Operation kal = new Operation(); 
		kal.input();
	}
	
}

 class Operation{
	
	int a,b;
	char choice,ch;
	String result;
	Scanner sc = new Scanner(System.in);
	void input(){
		do{	
			System.out.print("Enter a First Number :");
			a = sc.nextInt();
		
			System.out.print("Enter a Second Number :");
			b = sc.nextInt();
			sc.nextLine();
		
			System.out.println("Enter a your choice ....");
			System.out.println("A. Additon \n B.Substraction \n C. Multiplication \n D. Division");
			
			choice = sc.next().charAt(0);
			operationAirthmatic();
			System.out.println(result);
			System.out.print("Do you want a continue .....Y/N :");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
			
	void operationAirthmatic(){
				switch(choice){
					case 'A' :result= "A sum is a  :"+(a+b);
							break;
						
					case 'B' :result= "A difereance is a  :"+(a-b);
							break;
						
					case 'C' :result= "A Multiplication is a  :"+(a*b);
							break;
						
					case 'D' :result= "A division is a  :"+(float)a/b;
							break;
						
					default :result= "Invalid choice !!!";
							break;
				}
			}
	
}