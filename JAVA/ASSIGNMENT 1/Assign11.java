import java.util.*;

class Assign11{
	public static void main(String[] args){
		
	}
}

class ReverseNumber{
	
	int number;
	
	void input(){
		Scanner sc = new Scanner;
		
		number = sc.nextInt();
		
	}
	
	void logic(){
		int reverse=0,reminder;
		while(number>0){
			reminder= number%10;
			reverse = (reverse*10)+reminder;
			number /=10;
		}
		
	}
}