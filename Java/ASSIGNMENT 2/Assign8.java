import java.util.Scanner;
import java.util.*;


class Item{
		
	Int itemno; 
	Int qty; 
	Int rate; 
 
	
	Void getItem(Scanner sc){

		System.out.print("Enter a item no : ");
		itemNo = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter a Item quentity :");
		qty = sc.nextLine();
		
		System.out.print("Enter a item rate : ");
		rate = sc.nextInt();
		
		return rate * qty ;
			
	}
	
	Void dishItem(int ){
		System.out.print(no + "              ");
		System.out.print(name + "              ");
		System.out.print(age + "              ");
		System.out.print(salary + "              ");
	
	}
}

class Assign8{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Item[] obj = new Item[100];
		int[] ammount = new int[100];
		char = choice;
		int i = 0;
	
		// Enter a data in the of three number
		System.out.println("Enter a three employee Detail : \n ");
		do{
			System.out.println("\n \n Enter a employee detail  :"+(i+1));
			 obj[i] =  new Item();
			ammount[i] = obj[].getItem(sc);
			i++;
			sc.nextLine();                     
			System.out.println("\n Do you continue to add items : y/n ......");
			choice = sc.next().charAt(0);                     
			
		
		}while(choice == 'Y' || choice == 'y');
		
		System.out.println("\n \n Employee Detail is a  : \n");
		System.out.println("no     employee name    employee age    employee slary");
		System.out.println("---------------------------------------------------------------------");
		
		for(int k = 0 ; k < i ; k++){
			System.out.println("");
			obj[k].dishItem(ammount[i]);
		}
		System.out.println("\n\n");
    }

}
