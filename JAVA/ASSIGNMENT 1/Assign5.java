import java.util.Scanner;

class Assign5{
	public static void main(String[] args){
		StudentData kal = new StudentData(); 
		kal.input();
		kal.show();
	}
	
}

 class StudentData{
	
	String studentName,city,collageName;
	int studentRoll;
	void input(){
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter a Student Roll Number :");
		studentRoll = sc.nextInt();
		
		System.out.print("Enter a Student name :");
		studentName = sc.nextLine();
		
		System.out.print("Enter a Collage name:");
		collageName = sc.nextLine();
		
		System.out.print("Enter a Student city:");
		city = sc.nextLine();
		
		sc.close();
	}
	
	void show(){
		
		System.out.println("-------------------");
		System.out.println("A Student Roll number is:"+studentRoll);
		System.out.println("A Student name is:"+studentName);
		System.out.println("A Collage name:"+ collageName);
		System.out.println("A Student City:"+ city);
	}
	
}