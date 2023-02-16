import java.util.Scanner;

public class advancesorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		// max :- infinity
		// min:- -ve infinity
		int max = Integer.MIN_VALUE;// -ve infinity
		int min = Integer.MAX_VALUE;// infinity

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

		countSort(arr, min, max);
		print(arr);

	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void countSort(int[] arr, int min, int max) {
		int range = max - min;
		int freq_length = range + 1;
		int farr[] = new int[freq_length];// by default all elements are 0

		for (int i = 0; i < arr.length; i++) {
			int idx = arr[i] - min;
			farr[idx]++;
		}

		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}

		int ans[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int pos = farr[arr[i] - min];// pos=farr[8-3]=farr[5]=11
			int idx = pos - 1;// 10
			ans[idx] = arr[i];// ans[10]=8
			farr[arr[i] - min]--;// farr[8-3] = farr[5]-- = farr[5]-1;
		}

		for (int i = 0; i < ans.length; i++) {
			arr[i] = ans[i];
		}

	}

}
