import java.util.Scanner;

public class Coding_Problems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//int digit=sc.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		//floor wise
		for(int floor=max; floor>=1;floor--) { //7
			//building wise
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=floor) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
				
//		System.out.println(digitFrequency(n,digit));
//		System.out.println(span(arr));

	}

	private static int span(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(max>arr[i])
				max=arr[i];
			
			if(min<arr[i])
				min=arr[i];
		}
		
		return max-min;
	}

	private static int digitFrequency(int n, int digit) {
		
		int count=0;
		while(n!=0) {
			int d=n%10;
			if(d==digit)
				count++;
			n=n/10;
		}
		return count;
	}

}
