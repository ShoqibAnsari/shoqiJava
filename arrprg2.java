import java.util.Scanner;

public class arrprg2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of array");
		int arr[]=new int[scan.nextInt()];

for(int i = 0;i<=arr.length-1;i++){
	arr [i]=scan.nextInt();
	
}
System.out.println("Array content are");
for(int i=0;i<=arr.length-1;i++){
	if(i%2==0){
	System.out.println(arr[i]);
	}
}
	}	

}
