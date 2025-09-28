import java.util.Scanner;
import java.util.*;

class Calculation{
	
	static int sum(int m, int n, int o){
		return m+n+o;
	}
	
	static int sum(int m, int n){
		return m+n;
	}
        
}

class Assign6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a first number        : ");
		int m = sc.nextInt();
		
		System.out.print("Enter a second number       : ");
		int n = sc.nextInt();
		
		System.out.print("Enter a third number        : ");
		int o = sc.nextInt();
		
		System.out.println("Method overloading !!!!!!!!");
		System.out.println("first two number sum is : " +Calculation.sum(m,n));
		System.out.println("All three number sum is : " +Calculation.sum(m,n,o));
        
    }

}
