import java.util.*;

class Assign16{
	public static void main(String[] args){
		Number kal = new Number();
		kal.write();
	}
}

class Number{
	int Number = 1;
	
	void write(){
		System.out.println("A 50 Number is a :");
		while(Number!=51){
			System.out.print(Number+",");	
			Number++;
		}
	}
}
