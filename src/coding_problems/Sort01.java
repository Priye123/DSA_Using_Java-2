package coding_problems;

import java.util.Scanner;

public class Sort01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		// 1 1 0 0 1 0
		int i = 0;
		int j = 0;

		while (i < a.length) {
			if (a[i] == 1) {
				i++;
			} else {
				swap(a, i, j);
				i++;
				j++;
			}
		}
		
		System.out.println("The sorted 0 1 elements are::");
		
		for(int x:a) {
			System.out.println(x);
		}

	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
