import java.util.*;

class Assign25{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int row,total=0;
		
		System.out.print("Enter a row number:");
		row = sc.nextInt();
		
		int arr[]= new int[row];
		
		for(int i=0;i<row;i++){
			System.out.print("Enter element of index ["+i+"]:");
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("\nPrinting a Array : \n");
		
		for(int i=0;i<row;i++){
			System.out.println(arr[i]);
			total+=arr[i];
		}

		
		System.out.println("A total is a : "+total);
	}
}