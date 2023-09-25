import java.util.Scanner;

public class jagg2d {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of 1d array");
	int arr[][]=new int [scan.nextInt()][];
	System.out.println("Enter the length of 2d array");
for(int i=0;i<=arr.length-1;i++)	
{
	System.out.println("Enter the length of 2d array for 1d"+i);
	arr[i]=new int[scan.nextInt()];
}
for (int i=0;i<=arr.length-1;i++){
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.print("enter the array element of ["+i+"]["+j);
		arr[i][j]=scan.nextInt();
	}
	System.out.println();
}
for (int i=0;i<=arr.length-1;i++){
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.print(arr[i][j]+" ");
		
	}
	System.out.println();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}