import java.util.*;

class Assign12{
	public static void main(String[] args){
		SumNumber kal = new SumNumber();
		System.out.println("A 10 number sum is a :"+kal.sum());
	}
}

class SumNumber{
	int total=0,count=10;
	
	int sum(){
		while(count!=0){
			total+=count;
			count--;
		}
		return total;
	}
	
}