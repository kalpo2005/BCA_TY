import java.util.Scanner;
import java.util.*;

class Number{
        
		static boolean checkNumber(Scanner sc){
			System.out.print("Enter a number for whether chrcking : ");
			int Number = sc.nextInt();
			if(Number>0)
				return true ;
			return false ;
		}
}

class Assign9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int num =-50;
		 if(Number.checkNumber(sc)){
		 System.out.println("Number is a positive !!!");
			 return;
		 }
		 System.out.println("Number is a Nagetive !!!");
    }

}
