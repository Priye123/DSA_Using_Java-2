package standardproblems;

import java.util.Scanner;

public class CodingProblems {

	public static void main(String[] args) {
		//rotateNumber();
		//gcd_lcm();
		//reverseArray();
		//rotateArray();
		//inverseArray();
		//binarySearch();//array must be sorted O(logn)
		ceilFloor();
	}

	private static void ceilFloor() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int data=sc.nextInt();
		
		int low=0,high=arr.length-1,floor=0,ceil=0;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]<data) {
				low=mid+1;
				floor=arr[mid];
			}else if(arr[mid]>data) {
				high=mid-1;
				ceil=arr[mid];
			}else {
				ceil=arr[mid];
				floor=arr[mid];
				break;
			}
		}
		System.out.println("Ceil::"+ceil);
		System.out.println("Floor::"+floor);
		
	}
	
	private static void binarySearch() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int elementToSearch=sc.nextInt();
		
		int low=0,high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]<elementToSearch) {
				low=mid+1;
			}else if(arr[mid]>elementToSearch) {
				high=mid-1;
			}else {
				System.out.println("Element found at "+mid+"th position");
				return;
			}
		}
		
	}

	static int inv[];
	private static void inverseArray() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		inv=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			//inv[arr[i]]=i;
			inve(arr,i,arr[i]);
		}
	}


	private static void inve(int[] arr, int i, int j) {
		inv[j]=i;
	}

	private static void rotateArray() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int k=sc.nextInt();//k=no of rotations
		k=k%arr.length;
		
		if(k<0) {
			k=arr.length+k;
		}
		
		// [1,2,3,4,5]
		//1st step
		rev(arr,0,arr.length-k-1);//[2,1]
		
		//2nd step
		rev(arr,arr.length-k,arr.length-1);// [5,4,3]
		
		// modified array= [ 2,1,5,4,3]
		//3rd step
		rev(arr,0,arr.length-1);//[3,4,5,1,2]
		
		print(arr);
	}

	private static void print(int[] arr) {
		for(int x:arr) {
			System.out.println(x);
		}
	}

	private static void rev(int[] arr,int lo,int hi) {
		
		for(int i=lo,j=hi;i<=j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
	
	private static void reverseArray() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		for(int h:rev(arr)) {
			System.out.println(h);
		}
	}

	private static int[] rev(int[] arr) {//4k
		
//		int[] arr=new int[a.length];//arr=5k
//		arr=a;
		for(int i=0,j=arr.length-1;i<=j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}

	private static void gcd_lcm() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int min=n1>n2?n2:n1;// 16>10?
		int max=n1>n2?n1:n2;
//		if(n1>n2) {
//			min=n2;
//		}else {
//			min=n1;
//		}
		
		//gcd
		for(int i=min;i>=0;i--) {
			if(n1%i==0 && n2%i==0) {
				System.out.println("GCD IS::"+i);
				break;
			}
		}
		
		//lcm
		for(int i=1;i<=max;i++) {
			int r=max*i;
			if(r%min==0) {
				System.out.println("LCM IS::"+r);
				return;
			}
		}
	}

	private static void rotateNumber() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int noOfRotations=sc.nextInt();
		
		int nod= (int) Math.floor ((Math.log10(n)+1));
		
		noOfRotations=noOfRotations%nod;
		
		if(noOfRotations<0) {
			noOfRotations=noOfRotations+nod;
		}
		
		// O(1)
		//1st step
		int x=n/(int) (Math.pow(10, noOfRotations));
		
		//2nd step
		int y=n%(int) (Math.pow(10, noOfRotations));
	
		//3rd step
		int rotatedNumber= y *(int) Math.pow(10, nod-noOfRotations)+x;
		
		System.out.println(rotatedNumber);
	}

}
