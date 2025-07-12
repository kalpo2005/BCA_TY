import java.util.*;

class Assign162{
	public static void main(String[] args){
		Series kal = new Series();
		kal.input();
		kal.process();
	}
}
// 1 3 6 11 18 29....

class Series{
	int Number,count=1;
	
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a series lenght :");
		Number = sc.nextInt();
	
	}
	
	void process(){
		int value =1;
		int count=1;
		int returnPrime=2;
		System.out.println(count);
		count+=2;
		System.out.println(count+"------");	
		while(value<=Number){
	returnPrime=primeCheck(returnPrime);
		System.out.println(count+returnPrime);
	//	returnPrime=primeCheck(returnPrime);
			
			value++;
		}
	}
	
	int primeCheck(int prime){
		int primeNumber=prime+1;
		int count=1;
		
		for(int i=primeNumber;;i++){
			for(int j=2;j<i; j++){
				if(i%j==0){
					count=0;
					break;
				}
				
				
			}
			
			if(count==1){
				primeNumber=i;
					break;
			}
			
		}
		
		return primeNumber;
	}
	
}

