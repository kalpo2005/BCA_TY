import java.util.Scanner;
import java.util.*;

class Assign3{
	public static void main(String[] args){
		Operation kal = new Operation(); 
		kal.input();
	}
	
}

 class Operation{
	
	int choice;
	char ch;
	String result = " A day is a : ";
	Scanner sc = new Scanner(System.in);
	void input(){
		do{	
			System.out.print("Enter a First Number for day name :");
			choice = sc.nextInt();
	
			operationAirthmatic();
			System.out.println(result);
			
			System.out.print("Do you want a continue .....Y/N "); // if continue
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
			
	void operationAirthmatic(){
				switch(choice){
					case 1 :result= " Sunday " ;
							break;
						
					case 2 :result= " Monday " ;
							break;
						
					case 3 :result= " Tuesday " ;
							break;
						
					case 4 :result= " Wednesday " ;
							break;
							
					case 5 :result= " Thursday " ;
							break;
							
					case 6 :result= " Friday " ;
							break;
							
					case 7 :result= " Saturday " ;
							break;
						
					default :result= "Invalid choice !!!";
							break;
				}
			}
	
}