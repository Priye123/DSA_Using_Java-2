package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
//		ArrayList<Integer> numberList=new ArrayList<>();
//		
//		numberList.add(10);
//		numberList.add(20);
//		numberList.add(30);
//		numberList.add(40);
//		numberList.add(50);
		
		List<Integer> numberList = Arrays.asList(10,15,30,45,55);
		
		//without using streams
//		List<Integer> evenNumberList=new ArrayList<>();
//		
//		for(int n:numberList) {
//			if(n%2==0)
//				evenNumberList.add(n);
//		}
//		
//		System.out.println(evenNumberList);
		
		//with streams
		
//		List<Integer> evenNumberList=numberList.stream()
//				.filter(n -> n %2==0)
//				.collect(Collectors.toList());
//		
//		System.out.println(evenNumberList);
		
//		numberList.stream()
//			.filter(n->n%2==0)
//			.forEach(n->System.out.println(n));
		
		//string array:- 10 elements
		//filter:- [6-8] both including
		
		List<String> names=Arrays.asList(null,"Raman",null,"Raju","Ram",null);
		names.stream().filter(n->n!=null).forEach(System.out::println);
		
		
	}

}
