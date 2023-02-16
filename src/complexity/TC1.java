package complexity;

import java.util.Scanner;

public class TC1 {

	//i/p:-n=6
	//o/p :- 21
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//O(1+1+.....30)=O(30)=O(1)
//		for(int i=0;i<6;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print("Hello"+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("Hello"+" ");
//			}
//			System.out.println();
//		}

		
		
		//1000*n = O(n)
		for(int i=0;i<1000;i=i*50) {
			for(int j=0;j<n;j++) {
				
			}
		}
		
		//1000*50=50000 O(1)
		for(int i=0;i<1000;i=i*50) {
			for(int j=0;j<50;j++) {
				
			}
		}
		
		//O(n)
		for(int i=0;i<n;i++) {
			for(int j=0;j<30;j++) {
				
			}
		}
		
		//O(m*n)
//		for(int i=0;i<m;i=i*50) {
//			for(int j=0;j<n;j++) {
//				
//			}
//		}
		
		//O(n*logn)
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j=j*3) {
				
			}
		}
		
		// n*n*n= O(n3)
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				for(int k=1;k<n;k++) {
					
				}
			}
		}
		
		
		//n2logn
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				for(int k=1;k<n;k=k*2) {
					
				}
			}
		}
		
		//O(lognlogn)
		for(int i=1;i<n;i=i*2) {
			for(int j=1;j<n;j=j*21) {
				
			}
		}
		
		//n*1= O(n)
		for(int i=n;i>=0;i--) {
			for(int j=1;j<6;j++) {
				
			}
		}
		
		//O(n2)
		for(int i=n;i>=0;i--) {
			for(int j=n;j>=0;j--) {
				
			}
		}
		
	}
}

//for(int i=0;i<n;i=i+20) {
//System.out.println("Ram");
//}
//int n;

		//O is worst case
//		int a=10;//O(1)
//		int b=20;//O(1)
//		int c=30;//O(1)
//		int d=40;//O(1)
//		int e=50;//O(1)
		
		//TC:- O(1)
//		for(int i=0;i<6;i++) {
//			System.out.println("Ram");
//			n=sc.nextInt();
//		}
//		
//		//TC:-O(1)
//		for(int i=0;i<1000;i++) {
//			System.out.println("Ram");
//			n=sc.nextInt();
//		}
//		
//		//TC:-O(temp)
//		for(int i=0;i<temp;i++) {
//			System.out.println("Ram");
//			n=sc.nextInt();
//		}
//		
		
