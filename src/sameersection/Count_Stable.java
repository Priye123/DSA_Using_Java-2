package sameersection;

import java.util.Scanner;

public class Count_Stable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

		countStableSort(arr, max, min);
		print(arr);

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	private static void countStableSort(int[] arr, int max, int min) {
		int range = max - min;
		int farr[] = new int[range + 1];// 0

		for (int i = 0; i < arr.length; i++) {
			farr[arr[i] - min]++;
		}

		//convert it into prefix sum array
		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}

		int ans[] = new int[arr.length];
		
		//stable sort(filling ans array)
		for (int i = arr.length - 1; i >= 0; i--) {
			int val = arr[i];
			int pos = farr[val - min];// farr ka content
			int idx = pos - 1;// answer array ka index
			ans[idx] = val;
			farr[val - min]--;
		}
		
		//copy ans array into original array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
	}

}
