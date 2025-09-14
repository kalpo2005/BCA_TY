/**
* Write a program in java that use hierarchical inheritance and use method for get and 
display detail as per given class information. 
*/

import java.util.*;

class Account{
	int accountNumber;
	String accounType,holerName;	
	char chooseType;
	
	void getData(Scanner sc ,char type){
		
		System.out.println("\n------------ Enter a Account  Detail ---------");
		
		System.out.print("Enter a Account Number    : ");
		accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a Holder Name       : ");
		holerName = sc.nextLine();
		
		accounType = (type == 'y' || type == 'y') ? "current":"saving";		
	}
	
	void display(){
		
		System.out.println("\n------------ Account  Detail is below ---------\n");
		
		System.out.println("Account Number is        : "+ accountNumber);
		System.out.println("Account Holder Name      : "+ holerName);
		
		System.out.println("Account Type is          :"+  accounType);
		
	}
}

class SavingAccount extends Account{
	float balance,minimum;
	
		void init(Scanner sc,char type){
		getData(sc,type);
		
		
		System.out.print("Enter a Balance : ");
		balance = sc.nextInt();
		
		System.out.print("Enter a Minimum : ");
		minimum = sc.nextInt();
		
		while(minimum>balance){
			System.out.print("------------ Please try again balance grater than minimum");
			System.out.print("Enter a Balance        : ");
			balance = sc.nextInt();
		}
		display();
		System.out.println("Account Mimimum balance  : "+ minimum);
		System.out.println("Account current balance  : "+ balance);
	}
}

class CurrentAccount extends Account{
	float balance,minimum;
	
	void init(Scanner sc,char type){
		
		getData(sc,type);
		
		System.out.print("Enter a Balance        : ");
		balance = sc.nextInt();
		
		System.out.print("Enter a Minimum        : ");
		minimum = sc.nextInt();
		
		while(minimum>balance){
			System.out.println("------------ Please try again balance grater than minimum\n");
			System.out.print("Enter a Balance        : ");
			balance = sc.nextInt();
		}
		display();
		System.out.println("Account Mimimum balance      : "+ minimum);
		System.out.println("Account current balance      : "+ balance);
	}
}

class Assign8{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
			char chooseType;
			
		System.out.print("Do you want a current account  default(saving) ...Y/N        : ");
		chooseType = sc.next().charAt(0);
		
		if(chooseType == 'y' || chooseType == 'y'){
			CurrentAccount kal = new CurrentAccount();
			kal.init(sc,chooseType);
		}else{
			SavingAccount kal = new SavingAccount();
			kal.init(sc,chooseType);
		}
		
	}
}
