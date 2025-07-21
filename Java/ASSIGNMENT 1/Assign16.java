import java.util.*;

class Assign16{
	public static void main(String[] args){
		Series kal = new Series();
		kal.input();
		kal.process();
	}
}

class Series{
	int Number,count=1;
	
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a series lenght :");
		Number = sc.nextInt();
	
	}
	
	void process(){
		
		int value =2,i=1;
		System.out.println(count);
		while(Number>i){

			int temp =0;
			for(int j=1;j<=value;j++){
				if(value % j ==0)
					temp++;
			}
			if(temp ==2){
				count+=value;
				i++;
				System.out.println(count);
			}
			value++;
		}
	}
	
}

