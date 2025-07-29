import java.util.Scanner;

class Employee{
		
	int no,age,salary;
	String name;
	
	void input(	Scanner sc){

		System.out.print("Enter an employee id: ");
		no = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter an employee name :");
		name = sc.nextLine();
		
		System.out.print("Enter an employee Age : ");
		age = sc.nextInt();
		
		System.out.print("Enter a employee salary : ");
		salary = sc.nextInt();
			
	}
	
	void display(){
		System.out.print(no + "     ");
		System.out.print(name + "     ");
		System.out.print(age + "     ");
		System.out.print(salary + "     ");
	
	}
}

class Assign6{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Shopping[] obj = new Shopping[100];
		int i = 0;
	
		// Enter a data in the of three number
		System.out.prinln("Enter a three employee Detail : \n ")
		do{
			Employee kal = new Employee();
			obj[i++] = kal;
			kal.input(sc);
			sc.nextLine();                     
			
		
		}while(i<=3);
		
		System.out.println("\n \n Employee Detail is a  : \n");
		System.out.println("no     employee name    employee age    employee slary");
		System.out.println("---------------------------------------------------------------------");
		
		for(int k = 0 ; k < i ; k++){
			obj[i].display();
		}
    }

}
