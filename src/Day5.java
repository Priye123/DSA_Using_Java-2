import java.util.Arrays;
import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {

		// we can't craete the array in java without new.
		// int[] arr1 = new int[] {1,2};
		Scanner sc = new Scanner(System.in);
//		//String name = sc.next(); 
//		 
//		System.out.println("Enter the size of any array::");
//		int n=sc.nextInt();
//		 
//		// copying the array
//		int[] arr=new int[n]; //decalare + initialization
//		
//		int[] arr2;
//		arr=new int[n];
//		
//		//int arr2[]= new int[n];
//				
//				
//		int[] arr1=arr; 
//		
//		
//		System.out.println("Input array::");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		System.out.println("Output array::");
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+ "  ");
//		}
//		
//		int [] scores = new int []  {23, 34, 55, 64, 23, 21};
//		System.out.println(scores[3]); // 64
//		
//		//scores = {23, 34, 55, 64, 23, 21};
//		
//		int [] scores1 = {23, 34, 55, 64, 23, 21};
//		
//		// In java, defualt integer value is 0.
//		// default string value is null

//		double marks[]= new double[4];
//		marks[0]=95;
//		marks[4]=100;
//		
//		System.out.println(marks[6]);
//		System.out.println(marks[3]); // 0.0
//		System.out.println(marks[4]); // 100

		// i/p:- arr={15,15,20,10,60} o/p:-120
//		int arr[]={15,15,20,10,60};
//		int sum=0;
//		for(int i=0;i<5;i++) {
//			sum=sum+arr[i]; 
//		}
//		
//		System.out.println(sum);

//		Linear Search
//
//		12 34 54 32 16 76
//
//		search:- 97
//		o/p::- -1
//
//		search :- 32
//		o/p:- Yes 3

//		int arr[]= {12,34,54,32,16,76};
//		int search=sc.nextInt(); //34
//		int flag=0;
//		
//		for(int i=0;i<6;i++) {  
//			
//			if(search==arr[i]) { // 34 == 34
//				System.out.println("Yes "+i); //Yes 1
//				flag=1;
//				break;
//			}
//			
//		}
//		
//		if(flag==0) {
//			System.out.println("-1");
//		}

		// Binary Search
//		int arr[] = { 12, 34, 54, 32, 16, 76 };
//		Arrays.sort(arr); // internally quick sort:- O(log n)
//		for (int i = 0; i < 6; i++)
//			System.out.print(arr[i] + " ");
//
//		int search = sc.nextInt();
//		int l = 0;
//		int h = arr.length - 1;
//		int flag=0;
//
//		while (l <= h) {
//			int mid = (l + h) / 2;
//
//			if (arr[mid] > search) { 
//				h = mid - 1;
//			} else if (arr[mid] < search) {
//				l = mid + 1;
//			} else if (arr[mid] == search) {
//				System.out.println("Yes");
//				flag=1;
//				break;
//			}
//		}
//		if(flag==0)
//			System.out.println("Element not found");

//	for-each loop
//	for(datatype-name a: array){
//	}	

//		int arr[] = { 12, 34, 54, 32, 16, 76 }; // 12 54 16
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "  ");
//		}
//
//		String s[] = { "sameer", "priye", "subhakant" };
//
//		for (String w : s) {
//			System.out.println(w);
//		}
//
//		for (int a : arr) {
//			System.out.println(a);// 12 34 54 32 16 76
//		}
		
		int arr[]={15,15,20,10,60};
		
		int z[]=sum(arr,0);
		
		System.out.println(z);//starting address
		
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

	// Java is always call by reference.
	public static int[] sum(int[] arr1, int sum) {
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr1[i]+1;
		}
		
		return arr1;
	}
	
}
