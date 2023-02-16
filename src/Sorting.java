import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);

	}

	private static void bubbleSort(int[] arr) {

		for (int i = 1; i <= arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i; j++) {

				if (isSmaller(arr, j + 1, j)) {
					swap(arr, j + 1, j);
				}
			}

		}

		System.out.println("The sorted elements are::");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void swap(int[] arr, int m, int n) {
		System.out.println("Swap " + arr[m] + " and " + arr[n]);
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}

	private static boolean isSmaller(int[] arr, int m, int n) {
		// arr[n]= 5 arr[m] = 9
		System.out.println("Compare " + arr[m] + " and " + arr[n]);
		if (arr[m] < arr[n]) { // 5<9
			return true;
		} else {
			return false;
		}
	}

}
