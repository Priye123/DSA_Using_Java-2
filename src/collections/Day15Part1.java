package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Day15Part1 {

	public static void main(String[] args) {

		
		
		
		// HashMap:- doesn't maintains Insertion Order on the basis of keys
		// LinkedHashMap :- maintains Insertion Order on the basis of keys
		// Map<Integer,String> m=new LinkedHashMap<>();
//		SortedMap<Integer,String> m=new TreeMap<>();
//		m.put(1,"Priye");
//		m.put(3, "Rahul");
//		m.put(2, "Sameer");
//		m.put(-1, "Siree");
//		m.put(0, "Subhakant");
//		
//		System.out.println(m);

		// sorting done on the basis of ASCII values
//		SortedMap<String,Integer> m=new TreeMap<>();
//		m.put("Priye",1);
//		m.put("Rahul",1);
//		m.put("sameer",2);
//		m.put("Siree",5);
//		m.put("Subhakant",null);
//		m.put("Priye",7);
//		m.put("Priye", 12);
//		
//		System.out.println(m);

//		ArrayList<Object> a=new ArrayList<>();
//		a.add("Priye");
//		a.add(true);//AutoBoxing:- internally converted to wrapper
//		a.add(10);
//		Collections.sort(a);
//		System.out.println(a);

//		Queue<Integer> q=new ArrayDeque<>();
//		q.add(10);
//		q.add(20);
//		q.add(30);
//		
//		System.out.println(q);//output in FIFO order

		// TreeSet<Integer> s=new TreeSet<Integer>();//static polymorphism
//		SortedSet<Integer> s=new TreeSet<Integer>();//upcasting,dynamic polymorphism
//		s.add(10);
//		s.add(30);
//		s.add(40);
//		s.add(10);
//		s.add(5);
//		System.out.println(s);

		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();

		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(30);
		a.add(10);
		a.add(50);
		a.add(3);
		Collections.sort(a);
		//Expected:-address = package_name.class_name@hashcode (toString() method in Object class)
		System.out.println(a);
		System.out.println("------------------------------");
		System.out.println(a.toString());
//		
//		System.out.println("---------------------------------");
//		
//		Set<Integer> s=new LinkedHashSet<>();
//		s.add(10);
//		s.add(30);
//		s.add(40);
//		s.add(10);
//		System.out.println(s);

//		int a[] = new int[5];
//		a[1] = 5;
//		a[3] = 6;
//
//		for (int i : a) {
//			System.out.println(i);
//		}
//		
//		System.out.println("-------------------------------------------------");
//		
//		Integer a1[] = new Integer[5];//by default:- null
//		a1[1] = 5;
//		a1[3] = 6;
//
//		for (Integer i : a1) {
//			System.out.println(i);
//		}

//		if(a.contains(100))
//			System.out.println("found");

//		for(int i=0;i<a.length;i++) {
//			if(a[i]==100) {
//				System.out.println("found");
//				break;
//			}
//		}

	}

}
