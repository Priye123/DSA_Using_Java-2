package sorting;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		// 9 5 2 4 3
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		System.out.println(arr);
		
		print(arr);
	}

	private static void print(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
