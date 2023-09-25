import java.util.Scanner;

public class avvr {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
for (int i=0;i<=arr.length-1;i++){
	
	arr[i]=scan.nextInt();
}
int avrg=0;
int all_avrg=0;
System.out.println("array contents are");
int even=1;
for (int i=0;i<=arr.length-1;i++){
	
		avrg = avrg+arr[i];
		

	
}
all_avrg=avrg/arr.length;
System.out.println("The avrage of all the elements is "+ all_avrg);

	}

}