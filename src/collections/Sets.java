package collections;

import java.util.Arrays;

public class Sets {

	public static void main(String[] args) {
		int a[]= {5,2,5,1,2,3,4,5,6,7,2,7,1,2,3};//1,2,3,4,5,6,7
		System.out.println(a.length);
		
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int b[]=new int[a.length]; //unique elements
		int j=0;
		
		//1 1 2 2 2 2 3 3 4 5 5 5 6 7 7
		for(int i=0;i<b.length-1;i++) {
			
			if(a[i]!=a[i+1]) {
				b[j++]=a[i];
			}
		}
		
		b[j++]=a[b.length-1];
		
		for(int i=0;i<j;i++) {
			System.out.print(b[i]+" ");
		}
	}
}

//Set<Integer> s=new HashSet<>();
//System.out.println(s.size());
//
//for(int i:a) {
//	s.add(i);
//}
//
//System.out.println(s.size());

//System.out.println(s);

//WAP to remove duplicates from an array
////Approach
////1. sort the array ( using Arrays.sort(a));
////2. create a temporary array b[] which stores only unique elements.
////3. traverse old array a and copy all unique elements to b[]
////4. print elements of b[]
//

//Set<String> s=new LinkedHashSet<>();
//s.add("Ram");
//s.add("Raman");
//s.add("Ram");
//s.add("Ram");
//s.add("Mohan");
//s.add("Ram");
//System.out.println(s);
