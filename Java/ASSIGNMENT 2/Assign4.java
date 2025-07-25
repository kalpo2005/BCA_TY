import java.util.Scanner;
class Assign4{

    public static void main(String[] args){
		ArrayForEach arr = new ArrayForEach();
		arr.input();
		arr.showArray();
    }

}
class ArrayForEach{
	int n;
	int[] arr; 
	
	void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a arr size : ");
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0 ;i<n;i++){
			System.out.print("Enter a element of index ["+i+"] : ");
			arr[i] = sc.nextInt();
		}
	}
	
	void showArray(){
		System.out.println("Array element is a : ");
		for(int k : arr){
			System.out.println(k);
		}
	}
}