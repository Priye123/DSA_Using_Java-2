package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Raman","Priya","Sneha","Raju","Mukesh");//[5,5,5,4,6]
		
		//without streams
//		List<String> namesinUpperCase=new ArrayList<>();
//		
//		for(String name:names) {
//			namesinUpperCase.add(name.toUpperCase());
//		}
		
		//System.out.println(namesinUpperCase);
		
		//with streams
		List<String> namesinUpperCase=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesinUpperCase);
	}

}
