import java.util.Scanner;
import java.util.*;


class Book{
		
	int accno; 
	int price;
	String name;
 
	
	void getBook(Scanner sc){

		System.out.print("Enter a ACC NO : ");
		accno = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter a Book Name :");
		name = sc.nextLine();
		
		System.out.print("Enter a Book price : ");
		price = sc.nextInt();	
	}
	
	void dishBook(){
		System.out.print(accno + "\t\t");
		System.out.print(name + "\t\t");
		System.out.print(price + "\t\t");
	
	}
}

class Assign9{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Book[] obj = new Book[100];
		char choice;
		int i = 0;
	
		// Enter a data in the of three number
		System.out.println("Enter a three employee Detail : \n ");
		do{
			System.out.println("\n Enter a employee detail  :"+(i+1));
			 obj[i] =  new Book();
			 obj[i++].getBook(sc);
			sc.nextLine();                     
			System.out.println("\n Do you continue to add Books : y/n ......");
			choice = sc.next().charAt(0);                     
			
		
		}while(choice == 'Y' || choice == 'y');
		
		System.out.println("\n \n Book Detail is a  : \n");
		System.out.println("Acc No     Book name    Book price");
		System.out.println("---------------------------------------------------------------------");
		
		for(int k = 0 ; k < i ; k++){
			System.out.println("");
			obj[k].dishBook();
		}
		System.out.println("\n ---------------------------------------------------------------------");
    }

}
