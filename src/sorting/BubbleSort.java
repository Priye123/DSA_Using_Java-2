package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		// 5 9 8 2 1
		// itr is number of times outer loop runs
		for (int itr = 1; itr <= size - 1; itr++) {

			// j is a pointer
			for (int j = 0; j < size - itr; j++) {
				if (isSmaller(arr, j + 1, j)) {
					swap(arr, j + 1, j);
				}
			}
		}
		print(arr);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static boolean isSmaller(int[] arr, int i, int j) {
		if (arr[i] < arr[j])
			return false;
		else
			return true;
	}

	private static void print(int[] arr) {
		for (int x : arr)
			System.out.println(x);
	}

}
