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
		int returnPrime=1;
		System.out.println(count);

		while(value<=Number){
			returnPrime=primeCheck(returnPrime);
		//	System.out.println("return  value"+returnPrime);
			count+=returnPrime;
			System.out.println(count);
		//	returnPrime=primeCheck(returnPrime);
			
			value++;
		}
	}
	
	int primeCheck(int prime){
		for(int i=prime+1;;i++){
			int temp=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					temp++;
				}
			}
			if(temp==2){
				return i;
			}
		}
		

	}
	
}

