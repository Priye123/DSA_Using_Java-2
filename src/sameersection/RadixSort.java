package sameersection;

import java.util.Scanner;

public class RadixSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		radixSort(arr);
		print(arr);
	}

	private static void radixSort(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int val : arr) {
			max = Math.max(max, val);
		}

		int exp = 1;

		while (exp <= max) {
			countStableSort(arr, exp);
			exp = exp * 10;//1000
		}

	}

	private static void countStableSort(int[] arr, int exp) {
		int farr[] = new int[10];// min=0,max=9

		for (int i = 0; i < arr.length; i++) {
			farr[arr[i] / exp % 10]++;// min=0
		}

		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}

		int ans[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int pos = farr[arr[i] / exp % 10] - 1;
			ans[pos] = arr[i];
			farr[arr[i] / exp % 10]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
