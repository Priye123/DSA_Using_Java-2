package complexity;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int key_to_find=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			if(arr[i]==key_to_find) {
				System.out.println("found at index::"+i);
				return;
			}
		}
		
		System.out.println("Not found");
		
	}

}
