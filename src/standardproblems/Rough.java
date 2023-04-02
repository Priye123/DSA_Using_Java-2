package standardproblems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Rough {

	public static void main(String[] args) {
		Map<Integer,Set<Integer>> records=new LinkedHashMap<>();
		
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(1);
		//[1,2]
		
		records.put(100, set);//{100:[1,2]}
		
		Set<Integer> set1=new HashSet<>();
		set1.add(5);
		set1.add(5);
		set1.add(6);
		//[6,5]
		
		records.put(200, set1);//{100:[1,2],200:[6,5]}
		
		System.out.println(records);
	}

}
