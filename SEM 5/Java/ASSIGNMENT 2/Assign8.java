import java.util.Scanner;
import java.util.*;


class Item{
		
	int itemno; 
	int qty; 
	int rate;
	int ammount;
 
	
	void getItem(Scanner sc){

		System.out.print("Enter a item no : ");
		itemno = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter a Item quentity :");
		qty = sc.nextInt();
		
		System.out.print("Enter a item rate : ");
		rate = sc.nextInt();
		
		ammount = rate * qty ;		
	}
	
	void dishItem(){
		System.out.print(itemno + "\t\t");
		System.out.print(qty + "\t\t");
		System.out.print(rate + "\t\t");
		System.out.print(ammount + "\t\t");
	
	}
}

class Assign8{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Item[] obj = new Item[100];
		int totalAmmount =0;
		char choice;
		int i = 0;
	
		// Enter a data in the of three number
		System.out.println("Enter a three employee Detail : \n ");
		do{
			System.out.println("\n Enter a employee detail  :"+(i+1));
			 obj[i] =  new Item();
			 obj[i++].getItem(sc);
			sc.nextLine();                     
			System.out.println("\n Do you continue to add items : y/n ......");
			choice = sc.next().charAt(0);                     
			
		
		}while(choice == 'Y' || choice == 'y');
		
		System.out.println("\n \n Product Detail is a  : \n");
		System.out.println("itemNo     item qntity    item rate    item ammount");
		System.out.println("---------------------------------------------------------------------");
		
		for(int k = 0 ; k < i ; k++){
			System.out.println("");
			obj[k].dishItem();
			totalAmmount += obj[k].ammount;
		}
		System.out.println("\n\n");
		System.out.println("Total ammount is a : \t\t\t\t"+totalAmmount);
    }

}
