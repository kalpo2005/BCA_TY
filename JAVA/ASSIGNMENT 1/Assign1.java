import java.util.Scanner;

class Assign1{
	public static void main(String[] args){
		StudentData kal = new StudentData(); 
		kal.input();
		kal.show();
	}
	
}

 class StudentData{
	
	String studentName,collageName,collageAddress;
	void input(){
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter a Student name :");
		studentName = sc.nextLine();
		
		System.out.print("Enter a Collage name:");
		collageName = sc.nextLine();
		
		System.out.print("Enter a Collage Address name:");
		collageAddress = sc.nextLine();
		
		sc.close();
	}
	
	void show(){
		
		System.out.println("-------------------");
		System.out.println("A Student name is:"+studentName);
		System.out.println("A Collage name:"+ collageName);
		System.out.println("A Collage Address name:"+ collageAddress);
	}
	
}