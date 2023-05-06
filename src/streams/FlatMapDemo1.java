package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		//map()
//		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
//		List<Integer> list2=list1.stream().map(n->n+10).collect(Collectors.toList());
//		System.out.println(list2);
		
		//flatmap()
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		//List<Integer> finalList=new ArrayList<>();
//		for(int x:list1)
//			finalList.add(x);
//		for(int x:list2)
//			finalList.add(x);
//		for(int x:list3)
//			finalList.add(x);
//		System.out.println(finalList);
//		List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);
//		System.out.println(finalList);
		
		List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);
		
		List<Integer> f=finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(f);

	}

}
