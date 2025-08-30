/**
* Write a java program that read and display information that contains the following 
classes. Class emp(Emp_no, Emp_name, Salary), Class Dept(Dept_code, name). 
Use single inheritance.

*/

import java.util.*;

class Dept{
	String deptName,deptCode;
}

class Emp extends Dept{
	int empNo,salary;
	String empName;
	
	Emp(Scanner sc){
		this.getData(sc);
		this.showData();
	}
	
	void getData(Scanner sc){
		
		System.out.print("Enter a Emp no: ");
		empNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a Emp name: ");
		empName = sc.nextLine();
		
		System.out.print("Enter a Department code no: ");
		deptCode = sc.nextLine();
		
		System.out.print("Enter a Department name: ");
		deptName = sc.nextLine();
		
		System.out.print("Enter a Emp salary: ");
		salary = sc.nextInt();
		
	}
	
	void showData(){
		
		System.out.println("---------------- Emp Detail is -------------------");
		System.out.println("Emp no: "+empNo);
		System.out.println("Emp name: "+empName);
		System.out.println("Emp department code: "+deptCode);
		System.out.println("Emp department name: "+deptName);
		System.out.println("Emp salary: "+salary);
		
	}
}



class Assign1{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		Emp kal = new Emp(sc);
	}
}