/**
*Write a java program to enter the data of a book and display it using the multi-level
inheritance using following information. Class first(Book_no, book_name), Class 
second(Author_name, Publisher), Class third(public first, public second)
*/

import java.util.*;

class Author{
	String authorName,publisher;	
}

class Book extends Author{
	
	int bookNo;
	String bookName;
}

class Public extends Book {

	void getData(Scanner sc){
		
		System.out.print("Enter a Book no      : ");
		bookNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter a Book name    : ");
		bookName = sc.nextLine();
		
		System.out.print("Enter a author name   : ");
		authorName = sc.nextLine();
		
		System.out.print("Enter a Publisher name: ");
		publisher = sc.nextLine();
		
	}
	
	void display(){
		
		System.out.println("---------------- Book information -------------------");
		System.out.println("Book no        : " + bookNo);
		System.out.println("Book name      : " + bookName);
		System.out.println("Author name    : " + authorName);
		System.out.println("Publisher name : " + publisher);
	}
}

class Assign3{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		Public kal = new Public();
		kal.getData(sc);
		kal.display();
	}
}
