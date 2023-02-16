package rahulpreviousclassdoubts;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//5

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
//		HashSet<Integer> hs=new HashSet<>();
//		
//		for(int i=0;i<n;i++) {
//			hs.add(arr[i]);
//		}
//		
////		System.out.println(hs);
////		System.out.println(hs.size());
//
//		int count[]=new int[hs.size()];//4
//		int c=0,m=-10000,idx=0;
//		for(int i=0;i<n;i++) { //4
//			
//			for(int j=i;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					c++;
//					arr[i]=m;
//					m--;
//				}
//			}
//			count[idx]=c;
//			idx++;
//		}

//		Arrays.sort(arr);
//		ArrayList<Integer> disntictElement=new ArrayList<>();
//		HashMap<Integer, Integer> hm=new HashMap<>();
//		int count=0,c=0,k=0;
//		
//		for(int i=0;i<arr.length;i++) {
////			if(arr[i]==arr[i+1]) {
////				count++;
////			}
//			
//			while(c<arr.length && arr[c]==arr[c+1]) {
//				c++;
//				count++;
//				k++;
//				i++;
//			}
//			
//			hm.put(arr[i], count);
//			count=0;
//			c=k;
//		}
//		System.out.println(hm);

		// way-1
//		int count=1;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i!=j && arr[i] == arr[j]) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				System.out.println(arr[i]);
//			}else {
//				count=1;
//			}
//		}

		// way-2
//		int count=1;
//		for (int i = 0; i < n; i++) {
//			for (int j = i+1; j < n; j++) {
//				if (arr[i] == arr[j]) {
//					arr[j]=-1;
//					count++;
//				}
//			}
//			if (count == 1 && arr[i]!=-1) {
//				System.out.println(arr[i]);
//			}else {
//				count=1;
//			}
//		}

		// way-3
//		boolean visited[]=new boolean[n];
//		
////		for(int i=0;i<n;i++) {
////			visited[i]=false;
////		}
//		
//		Arrays.fill(visited, false);
//		
//		for(int i=0;i<n;i++) {
//			
//			if(visited[i]==true)
//				continue;
//			
//			int count=1;
//			
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					visited[j]=true;
//					count++;
//				}
//			}
//			if(count==1) {
//				System.out.println(arr[i]);
//			}
//		}

		// way-4
//		int size = arr.length;
//		Arrays.sort(arr);
//		for (int i = 0; i < size; i++) {
//			int count = 1;
//			while (i < size - 1 && arr[i] == arr[i + 1]) {
//				i++;
//				count++;
//			}
//			if (count == 1)
//				System.out.print(arr[i] + " ");
//		}

		// way-5
		//int i = 0;

		// Traverse the array
//		while (i < n) {
//
//			int cur = arr[i];
//
//			// Stores frequency of
//			// the current element
//			int cnt = 0;
//
//			// Iterate until end of the
//			// array is reached or current
//			// element is not the same as the
//			// previous element
//			while (i < n && cur == arr[i]) {
//				cnt++;
//				i++;
//			}
//
//			// If current element is unique
//			if (cnt == 1) {
//				System.out.print(cur + " ");
//			}
//		}

	}

}
