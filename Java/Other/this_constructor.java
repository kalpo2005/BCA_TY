import java.util.Scanner;
import java.util.*;

class this_constructor{
	
	this_constructor(){
		this(100);
		System.out.println("default call");
	}
	
	this_constructor(int value){
		System.out.println("parameter call with value " + value);
	}
	
	
	public static void main(String[] args){
		this_constructor kal = new this_constructor(); 
	}
	
}

 