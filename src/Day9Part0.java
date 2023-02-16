import java.util.Scanner;

public class Day9Part0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//length of array
		
		int arr[]=new int[n]; //array of n size
		int sum=0;
		//input array elements
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();//6
			sum=sum+arr[i];// 0+5+6 it will give sum of elements of an array
		}
		
		//AP concept
		int numbers=n+1;
		int totalSum=(numbers*(numbers+1))/2;
		System.out.println("The missing number is::"+(totalSum-sum));

	}

}
