package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionLevel {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(30);
		l.add(40);
		
		if(l.contains(30)) {
			System.out.println("Found");
		}
		
		System.out.println(l);
		
		l.remove(2);
		
		System.out.println(l);
		

		Collection<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(30);
		c.add(40);
		
		//System.out.println(c);

		// System.out.println(c);

		Collection<String> name = new LinkedList<>();
		name.add("Ram");
		name.add("Rahul");
		name.add("Rana");

		// convert to Array

		Object[] i = name.toArray();
		//System.out.println(i);

		for (Object a : i) {
			//System.out.println(a);
		}

		// System.out.println(name.contains("Sameer"));

		// System.out.println(name);

		//upcasting :- parent class methods + overridden methods
		
		Collection<String> name1 = new LinkedList<>();
		
		name1.add("Raman");
		name1.add("Rahul kumar");
		name1.add("Rana Rishav");
		
		

		// System.out.println(name1.isEmpty());

		// System.out.println(name1);

		// name1.addAll(name);// the elements of collection name is added to name1
		// System.out.println(name);
		// System.out.println(name1);

		c.remove(30);
		// System.out.println(c.size());
		// System.out.println(name.remove("Rahul"));
		name1.remove("Rahul Kumar");
		// System.out.println(name1.size());
//		System.out.println(c);
//		System.out.println(name);
//		System.out.println(name1);

	}

}
