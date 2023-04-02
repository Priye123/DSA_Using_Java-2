package standardproblems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NHospitalMicrosoft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int hospitals[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				hospitals[i][j] = sc.nextInt();
			}
		}

		Map<Integer, Set<Integer>> map = new LinkedHashMap<>();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (map.containsKey(hospitals[i][j])) {
					Set<Integer> list1 = map.get(hospitals[i][j]);
					list1.add(i);
					map.put(hospitals[i][j], list1);
				} else {
					Set<Integer> list = new HashSet<>();
					list.add(i);
					map.put(hospitals[i][j], list);
				}
			}
		}
		int count = 0;

		for (int key : map.keySet()) {
			// System.out.println(key+":"+map.get(key));
			if (map.get(key).size() > count) {
				count = map.get(key).size();
			}
		}
		System.out.println(count);
	}

}
