import java.util.*;


class Assign3{
	
	public static void main(String[] args){
		YourName kal = new YourName();
		kal.input();
		kal.display();
	}
	
}

class YourName{
	
	String studentName;
	float basicSalary,hra,da;
	
	void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a emp_id:");
		studentName = sc.nextLine();
		sc.nextLine();
		
	}
	
	void display(){
		
		System.out.println("Your String is a  :"+ studentName);
	}
	
}