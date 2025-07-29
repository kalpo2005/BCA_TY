import java.util.*;

class Arraydemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int row,column,total=0;
		
		System.out.print("Enter a row number:");
		row = sc.nextInt();
		System.out.print("Enter a column number:");
		column = sc.nextInt();
		
		int arr[][]= new int[row][column];
		
		for(int i=0;i<row;i++){
			for(int j=0; j<column;j++){
				System.out.print("Enter element of index ["+i+"]["+j+"]:");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\nPrinting a Array : \n");
		
		for(int i=0;i<row;i++){
			for(int j=0; j<column;j++){
				System.out.print(" "+arr[i][j]);
				total+=arr[i][j];
			}
			System.out.println("");
		}
		
		System.out.println("A total is a : "+total);
	}
}