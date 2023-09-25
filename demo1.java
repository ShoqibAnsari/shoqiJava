
public class demo1 {

	public static void main(String[] args) {
		//create a one dimenstion array and store 10,20,30,40,50;//
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for (int i=0;i<=arr.length-1;i++)
		{
			
		if(i%2==0){
			System.out.println("Even index are"+arr[i]);
		}
		}
	}
	}


