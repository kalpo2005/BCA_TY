import java.util.Scanner;
import java.util.*;

class StudentDetail{
        int st_id,st_phone;
		String st_name,st_course;
		
		StudentDetail(){
			st_id = 23;
			st_phone =33355;
			st_name = "KALPESH";
			st_course = "BCA";
		}
		
		StudentDetail(int id,int phone,String name,String course){
			st_id = id;
			st_phone = phone;
			st_name = name;
			st_course = course;
		}
		
		void showData(StudentDetail kal){
			
			System.out.println("\n student detail is a  !!!!!!!!!!! ");
			
			System.out.println("Student Id is           : "+ kal.st_id);
			
			System.out.println("Student Phone number is : "+ kal.st_phone);
			
			System.out.println("Student name is         : "+ kal.st_name);
			
			System.out.println("Student course is       :"+ kal.st_course);
		}
}

class Assign4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Static value constructor call ");
        StudentDetail object1 = new StudentDetail();
		object1.showData(object1);
		
		System.out.print("Enter a roll number   : ");
		int rollno = sc.nextInt();
		
		System.out.print("Enter a Phone Number  : ");
		int phone = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" Enter a student name   : ");
		String name = sc.nextLine();
		
		System.out.print(" Enter a student couse   : ");
		String course = sc.nextLine();
		
		System.out.println("Manual deteail constructor call ");
        StudentDetail object2 = new StudentDetail(rollno,phone,name,course);
		object2.showData(object2);
    }

}
