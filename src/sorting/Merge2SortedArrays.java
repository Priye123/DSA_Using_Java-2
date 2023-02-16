package sorting;

import java.util.Scanner;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1st array input of size1
		int size1 = sc.nextInt();

		int a[] = new int[size1];

		for (int i = 0; i < size1; i++)
			a[i] = sc.nextInt();

		// 2nd array input of size2
		int size2 = sc.nextInt();

		int b[] = new int[size2];

		for (int i = 0; i < size2; i++)
			b[i] = sc.nextInt();

		// merged array of size1+size2

		int merged[] = new int[size1 + size2];
		int i = 0, j = 0, k = 0;

		while (i < size1 && j < size2) {

			if (a[i] < b[j]) {
				merged[k] = a[i];
				i++;
				k++;
			} else {
				merged[k] = b[j];
				j++;
				k++;
			}
		}

		// array a ke element agar bach gye h to to usko yuhi print kr denge
		while (i < a.length) {
			merged[k] = a[i];
			i++;
			k++;
		}

		// array b ke element agar bach gye h to to usko yuhi print kr denge
		while (j < b.length) {
			merged[k] = b[j];
			j++;
			k++;
		}

		for (int m = 0; m < merged.length; m++) {
			System.out.println(merged[m]);
		}

	}

}
