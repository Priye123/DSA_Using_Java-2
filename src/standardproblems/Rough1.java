package standardproblems;

import java.util.Scanner;

public class Rough1 {

	public static void main(String[] args) {
		// rotate90();
		// diagonalTraversal();
		// searchInaSorted2darray();
		// stringCompression();
		// toggleCase();
		// asciiDiff();
		// bubbleSort();
		//mergeSort();
		partition();
	}

	private static void partition() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		int pivot=sc.nextInt();
		
		int i=0,j=0;
		
		while(i<arr.length) {
			if(arr[i]>pivot) {
				i++;
			}else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		
		for(int x:arr)
			System.out.println(x);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void mergeSort() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		int lo = 0, hi = arr.length - 1;

		int a[] = ms(arr, lo, hi);
		for (int x : a) {
			System.out.println(x);
		}
	}

	private static int[] ms(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int a[] = new int[1];
			a[0] = arr[hi];
			return a;
		}
		int mid = (lo + hi) / 2;
		int lh[] = ms(arr, lo, mid);
		int rh[] = ms(arr, mid + 1, hi);

		return mergeTwoSortedArrays(lh, rh);

	}

	private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int merged[] = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				merged[k] = arr1[i];
				i++;
			} else {
				merged[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < arr1.length) {
			merged[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			merged[k] = arr2[j];
			j++;
			k++;
		}

		return merged;

	}

	private static void bubbleSort() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	private static void asciiDiff() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(), t = "";
		for (int i = 0; i < str.length() - 1; i++) {
			char curr = str.charAt(i);
			char next = str.charAt(i + 1);
			t = t + curr + "" + (next - curr);
		}
		t = t + str.charAt(str.length() - 1);
		System.out.println(t);
	}

	private static void toggleCase() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(), t = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				t = t + Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				t = t + Character.toLowerCase(ch);
			}
		}
		System.out.println(t);
	}

	private static void stringCompression() {
		String s = "wwwwaaadexxxxxx";// aman
		String t = s.charAt(0) + "";

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				t = t + s.charAt(i);
			}
		}
		System.out.println(t);
	}

	private static void searchInaSorted2darray() {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int arr[][] = new int[rows][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int target = sc.nextInt();

		int row = 0, col = arr[0].length - 1;

		while (row < arr.length && col >= 0) {
			if (target > arr[row][col]) {
				row++;
			} else if (target < arr[row][col]) {
				col--;
			} else {
				System.out.println(row + " " + col);
				break;
			}
		}
	}

	private static void diagonalTraversal() {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int arr[][] = new int[rows][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int gap = 0; gap < arr.length; gap++) {
			for (int j = 0, k = gap; j < arr[0].length && k < arr[0].length; j++, k++) {
				System.out.println(arr[j][k]);
			}
		}
	}

	private static void rotate90() {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		transpose(arr);
		swapRowValues(arr);
		print(arr);
	}

	private static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void swapRowValues(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0, j = arr.length - 1; k <= j; k++, j--) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
			}
		}
	}

	private static void transpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i <= j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
	}

}
