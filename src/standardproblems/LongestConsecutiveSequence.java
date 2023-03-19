package standardproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		Map<Integer, Boolean> map = new HashMap<>();

		for (int val : arr) {
			map.put(val, true);
		}

		for (int val : arr) {
			if (map.containsKey(val - 1)) {
				map.put(val, false);
			}
		}

		int msp = 0, ml = 0;

		for (int val : arr) {
			if (map.get(val) == true) {
				int tl = 1;
				int tsp = val;// 8

				while (map.containsKey(tsp + tl)) {
					tl++;
				}

				if (tl > ml) { // 5 > 3
					msp = tsp;// msp=8
					ml = tl; // ml=5
				}
			}
		}

		for (int i = 0; i < ml; i++) {
			System.out.println(msp + i);
		}

	}

}
