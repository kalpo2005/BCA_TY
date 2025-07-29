import java.util.Scanner;

class Shopping{
		
	int itemCode,itemQnt,itemPrice,total;
	String itemName;
	
	void input(	Scanner sc){

		System.out.print("Enter a item code: ");
		itemCode = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter a item name:");
		itemName = sc.nextLine();
		
		System.out.print("Enter a item Quentity : ");
		itemQnt = sc.nextInt();
		
		System.out.print("Enter a item Price : ");
		itemPrice = sc.nextInt();
		
		total = itemPrice * itemQnt;	
	}
	
	void display(){
		System.out.print(itemCode + "     ");
		System.out.print(itemName + "     ");
		System.out.print(itemPrice + "     ");
		System.out.print(itemQnt + "     ");
		System.out.print(total + "     ");
	
	}
}

class Assign6{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0,toalAmount = 0;
		Shopping[] kal = new Shopping[5];
		char choice;
	
		do{
			
			kal[i++].input(sc);
			sc.nextLine();
			System.out.println("\n Do you continue to add items : y/n ......");
			choice = sc.next().charAt(0);                     
			
		
		}while(choice == 'Y' || choice == 'y');
		
		System.out.println("\n \n Your bill is a : \n");
		System.out.println("item code     item name    item price    item qntity     total");
		System.out.println("---------------------------------------------------------------------");
		
		for(int k = 0 ; k < i ; k++){
			
			obj[k].display();
			toalAmount += obj[i].total;
		}
		
		// Printing a gross total 
		System.out.println("A total paybale ammount is a :                               "+ toalAmount);

    }

}

