package standardproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import standardproblems.StandardProblems1.MapPair;
import standardproblems.StandardProblems1.RootPair;

class SortByValue implements Comparator<MapPair> {

	@Override
	public int compare(MapPair o1, MapPair o2) {
		return o2.value - o1.value;// sort in descending order
	}
}

class SortBysquareofThatValue implements Comparator<RootPair> {

	@Override
	public int compare(RootPair o1, RootPair o2) {
		return o1.squareofThatValue - o2.squareofThatValue;
	}

}

public class StandardProblems1 {

	public static void main(String[] args) {
		// majorityElement();// appears more than arraysize/2 times
		// missingNumbers();// print the elements which are not consecutive
		// sortNames();
		// intersectionof2Arrays();
		// isPanagram();// a String that contains all alphabets [a-z]
		// abcdefghijklmnopqrst uv abcd wx a yz
		// firstLongestSubstringwithoutrepeat();
		// stringCompression();
		// romanToInteger();
		// printCharactersinDescendingorderFrequency();
		// stringRotationorNot();
		// allPossiblesubstrings();
		// squareSortedarray();
		squareSortedarrayUsingComparator();
	}

	static class RootPair {
		int value;
		int squareofThatValue;

		public RootPair(int value, int squareofThatValue) {
			this.value = value;
			this.squareofThatValue = squareofThatValue;
		}

	}

	private static void squareSortedarrayUsingComparator() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

//		List<Integer> list = new ArrayList<>();
//
//		for (int i = 0; i < a.length; i++) {
//			list.add(a[i] * a[i]);
//		}

		List<RootPair> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(new RootPair(a[i], a[i] * a[i]));
		}

		for (RootPair r : list) {
			System.out.println(r.value + " " + r.squareofThatValue);
		}

		Collections.sort(list, new SortBysquareofThatValue());

		System.out.println("After sorting a/c to squareofThatValue values------------------------------");

		for (RootPair r : list) {
			System.out.println(r.value + " " + r.squareofThatValue);
		}

	}

	private static void squareSortedarray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i] * a[i]);
		}

		Collections.sort(list);

		System.out.println(list);
	}

	private static void allPossiblesubstrings() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.print(s.substring(i, j) + " ");
			}
			System.out.println();
		}

	}

	private static void stringRotationorNot() {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		String mainString = s1 + s1;

		if (mainString.contains(s2)) {
			System.out.println("Rotation of each other");
		} else {
			System.out.println("Not a Rotation of each other");
		}

		// System.out.println((s1+s1).contains(s2)?"Rotation of each other":"Not a
		// Rotation of each other");
	}

	static class MapPair {
		char key;
		int value;

		public MapPair(char key, int val) {
			this.key = key;
			value = val;
		}
	}

	private static void printCharactersinDescendingorderFrequency() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		ArrayList<MapPair> list = new ArrayList<>();

		for (char ch : map.keySet()) {
			list.add(new MapPair(ch, map.get(ch)));
		}

		for (MapPair m : list) {
			System.out.println(m.key + " " + m.value);
		}

		Collections.sort(list, new SortByValue());
		System.out.println("After sorting a/c to values------------------------------");

		for (MapPair m : list) {
			System.out.print(m.key);
		}
	}

	private static void romanToInteger() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = map.get(s.charAt(s.length() - 1));

		for (int i = s.length() - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				result = result - map.get(s.charAt(i));
			} else {
				result = result + map.get(s.charAt(i));
			}
		}
		System.out.println(result);
	}

	private static void stringCompression() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		System.out.print(s.charAt(0));
		int count = 1;

		for (int i = 1; i < s.length(); i++) {

			if (st.peek() != s.charAt(i)) {
				st.push(s.charAt(i));
				if (count != 1)
					System.out.print(count);
				System.out.print(s.charAt(i));
				count = 1;
			} else {
				count++;
			}
		}
		if (count != 1)
			System.out.print(count);
	}

	private static void firstLongestSubstringwithoutrepeat() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String longestTillNow = "", longest = "";
		Set<Character> set = new HashSet<>();
		int start = 0, end = 0;
		char ch = 0;

		for (int i = 0; i < s.length(); i++) {

			while (start < s.length() && end < s.length()) {
				ch = s.charAt(end);
				if (!set.contains(ch)) {
					set.add(ch);
					longest = longest + ch;
					end++;
				} else {
					if (longestTillNow.length() < longest.length()) {
						longestTillNow = longest;
						longest = "";
					}
					break;
				}
			}
			start++;
			end = start;
			set.clear();
		}
		System.out.println(longestTillNow);

	}

	private static void isPanagram() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int ht[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				continue;
			int idxofht = s.charAt(i) - 'a';
			ht[idxofht] = ht[idxofht] + 1;
		}

		for (int i = 0; i < 26; i++) {
			if (ht[i] <= 0) {
				System.out.println("Not a panagram");
				return;
			}
		}
		System.out.println("Panagram");
	}

	private static void intersectionof2Arrays() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int m = sc.nextInt();
		int b[] = new int[m];

		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(a[i]);
		}

		for (int i = 0; i < m; i++) {
			if (set.contains(b[i])) {
				System.out.println(b[i]);
			}
		}

	}

	private static void sortNames() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String names[] = new String[n];

		for (int i = 0; i < n; i++)
			names[i] = sc.next();

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (names[i].compareTo(names[j]) > 0) {
					// swap
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		for (String name : names) {
			System.out.println(name);
		}
	}

	private static void missingNumbers() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int m = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (m < arr[i])
				m = arr[i];
		}

		int hashtable[] = new int[m + 1];

		for (int i = 0; i < arr.length; i++) {
			int idxofhastable = arr[i];
			hashtable[idxofhastable] = hashtable[idxofhastable] + 1;
		}

		for (int i = 1; i < hashtable.length; i++) {
			if (hashtable[i] > 1) {
				System.out.println(i);
			}
		}
	}

	private static void majorityElement() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int x : map.keySet()) {
			if (map.get(x) > n / 2) {
				System.out.println(x);
				return;
			}
		}

		System.out.println("-1");
	}

}

//private static void printCharactersinDescendingorderFrequency() {
//
//	Scanner sc = new Scanner(System.in);
//	String s = sc.next();
//	Map<Character, Integer> map = new LinkedHashMap<>();
//
//	for (int i = 0; i < s.length(); i++) {
//
//		if (map.containsKey(s.charAt(i))) {
//			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//		} else {
//			map.put(s.charAt(i), 1);
//		}
//	}
//
//	ArrayList<MapPair> list = new ArrayList<>();
//
//	for (char ch : map.keySet()) {
//		// System.out.println(ch + " " + map.get(ch));
//		list.add(new MapPair(ch, map.get(ch)));
//	}
//
//	Collections.sort(list, new SortByValue() );
//	
//	for(MapPair m:list) {
//		System.out.print(m.key);
//	}
//}
