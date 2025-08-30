import java.util.Scanner;
import java.util.*;

class Detail{
	int id;
	String city,name;
	
	Detail(int id,String name,String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	void display(){
		System.out.println("Enter Detail is a : ");
		System.out.println("---------------------------");
		System.out.println("Id is a   :"+ id);
		System.out.println("Name is a :"+ name);
		System.out.println("City is a  :"+ city);
	}
	
}

class Assign1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int id;
		String name,city;
		
		System.out.print("Enter id   : ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter name : ");
		name = sc.nextLine();
		
		System.out.print("Enter city : ");
		city = sc.nextLine();
		
		
		// make object and call it 
		
		Detail kal = new Detail(id,name,city);
		kal.display();	
        
    }
}
