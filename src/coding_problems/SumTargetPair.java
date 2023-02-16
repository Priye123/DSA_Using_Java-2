package coding_problems;

import java.util.Arrays;
import java.util.Scanner;

public class SumTargetPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		int target = sc.nextInt();

		Arrays.sort(a);
		int i = 0;
		int j = a.length - 1;

		while (i != j) {

			if (a[i] + a[j] == target) {
				System.out.println(a[i] + " " + a[j]);
				i++;
				j--;
			} else if (a[i] + a[j] > target) {
				j--;
			} else {
				i++;
			}
		}

	}

}
