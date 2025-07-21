import java.util.*;


class Assign6{
	
	public static void main(String[] args){
		Employee kal = new Employee();
		kal.input();
		kal.display();
	}
	
}

class Employee{
	
	int emp_id;
	String emp_name;
	float basicSalary,hra,da;
	
	void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a emp_id:");
		emp_id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a employee name :");
		emp_name = sc.nextLine();
		
		System.out.print("Enter a Basic Salary name :");
		basicSalary = sc.nextFloat();
		
		System.out.print("Enter a hra name :");
		hra = sc.nextFloat();
		
		System.out.print("Enter a da name :");
		da = sc.nextFloat();
	}
	
	float result(){
		hra = basicSalary * hra/100;
		da = basicSalary * da/100;
		return (basicSalary+hra+da);
	}
	
	void display(){
		
		System.out.println("An employee ID is :"+ emp_id);
		System.out.println("An employee name is :"+ emp_name);
		System.out.println("An employee Basic Salary is :"+ basicSalary);
		System.out.println("A total salary is a :"+result());
	}
	
}