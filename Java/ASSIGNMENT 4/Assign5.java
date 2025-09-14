/**
* Write a program in java that use hierarchical inheritance and use method for get and 
display detail as per given class information. 
*/

import java.util.*;

class Svcg{
	int studId;
	String studName;
		
}

class Bca extends Svcg{
	int year,sem;
	char div;
	
	void getData(Scanner sc, String deptartment){
		
		System.out.println("\n------------ Enter a student Detail for department "+ deptartment +"---------");
		
		System.out.print("Enter a student Id        : ");
		studId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a student name      : ");
		studName = sc.nextLine();
		
		System.out.print("Enter a student division  : ");
		div = sc.next().charAt(0);
		
		System.out.print("Enter a student sem        : ");
		sem = sc.nextInt();
		
		System.out.print("Enter a student year        : ");
		year = sc.nextInt();
	}
	
	void showData(String deptartment){
		
		System.out.println("------------  student Detail of department "+ deptartment +"---------");
		
		System.out.println("student Id           : " + studId );
		System.out.println("student name         : "+ studName);
		System.out.println("student division is  : "+ div);
		System.out.println("student sem is       : "+ sem);	
		System.out.println("student year is      : "+ year);
	}
}

class Msw extends Svcg{
	int year,sem;
	char div;
	
	void getData(Scanner sc, String deptartment){
		
		System.out.println("------------ Enter a student Detail for department "+ deptartment +"---------");
		
		System.out.print("Enter a student Id        : ");
		studId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a student name      : ");
		studName = sc.nextLine();
		
		System.out.print("Enter a student division  : ");
		div = sc.next().charAt(0);
		
		System.out.print("Enter a student sem        : ");
		sem = sc.nextInt();
		
		System.out.print("Enter a student year        : ");
		year = sc.nextInt();
	}
	
	void showData(String deptartment){
		
		System.out.println("------------  student Detail of department "+ deptartment +"---------");
		
		System.out.println("student Id           : " + studId );
		System.out.println("student name         : "+ studName);
		System.out.println("student division is  : "+ div);
		System.out.println("student sem is       : "+ sem);	
		System.out.println("student year is      : "+ year);
	}
}

class Bhms extends Svcg{
	int year,sem;
	char div;
	
	void getData(Scanner sc, String deptartment){
		
		System.out.println("------------ Enter a student Detail for department "+ deptartment +"---------");
		
		System.out.print("Enter a student Id        : ");
		studId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a student name      : ");
		studName = sc.nextLine();
		
		System.out.print("Enter a student division  : ");
		div = sc.next().charAt(0);
		
		System.out.print("Enter a student sem        : ");
		sem = sc.nextInt();
		
		System.out.print("Enter a student year        : ");
		year = sc.nextInt();
	}
	
	void showData(String deptartment){
		
		System.out.println("------------  student Detail of department "+ deptartment +"---------");
		
		System.out.println("student Id           : " + studId );
		System.out.println("student name         : "+ studName);
		System.out.println("student division is  : "+ div);
		System.out.println("student sem is       : "+ sem);	
		System.out.println("student year is      : "+ year);
	}
}

class Assign5{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		
		Bca kal = new Bca();
		kal.getData(sc, "BCA");
		
		Msw M = new Msw();
		M.getData(sc,"MSW");
		
		Bhms B = new Bhms();
		B.getData(sc,"BHMS");
		
		kal.showData("BCA");
		B.showData("BHMS");
		M.showData("MSW");
	}
}
