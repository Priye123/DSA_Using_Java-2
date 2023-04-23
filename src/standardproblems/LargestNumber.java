package standardproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class LargestNumberComparator implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		String order1=a+b;
		String order2=b+a;
		return order2.compareTo(order1);
	}
	
}

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(largestNumber(arr));
		
	}

	private static String largestNumber(int[] arr) {
		
		//map integer array to string array
		String asStr[]= new String[arr.length];
		
		for(int i=0;i<asStr.length;i++) {
			asStr[i]=String.valueOf(arr[i]);
		}
		
		//sort Strings according to custom comparator
		Arrays.sort(asStr,new LargestNumberComparator());//O(nlogn)
		String t="";
		for(String a:asStr)
			t=t+a;
		
		return t;
	}

}
