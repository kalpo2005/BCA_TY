class Value{
	int a=13,b=05,c=2005;
	
	void display(){
		System.out.println("Your Birth date is :"+a+b+c);
	}
	
	public static void main(String args[]){
		Value v = new Value();
		v.display();
		System.out.println("Your Birth date is main function:"+v.a+v.b+v.c);
	}
}
 	
