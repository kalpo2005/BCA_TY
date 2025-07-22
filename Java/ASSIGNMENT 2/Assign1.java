import java.util.Scanner;

class CheckPerchantage{
	float percentage;
	String result = "Student grade is a : ";
	
	void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a percentage : ");
		percentage = sc.nextFloat();
		checkGrade();
		System.out.println(result);
		
	}
	void checkGrade(){
		if(percentage < 35)
			result +=" Fail !!";
		else if(percentage < 50 )
			result += " Pass !!!";
		else if(percentage < 60 )
			result += " Second class !!!";
		else if(percentage < 70 )
			result += " First Class  !!!";
		else if(percentage >= 70 &&  percentage <= 100 )
			result += " Distiction !!!";
		else
			result=" Invalid percentage!!!";
	}
	
}
class Assign1{

    public static void main(String[] args){
		CheckPerchantage kal = new CheckPerchantage();
		kal.input();
    }

}
