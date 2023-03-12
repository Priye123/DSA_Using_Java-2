package collections;

import java.util.LinkedList;

public class Rough {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(2, 50);
		System.out.println(l.get(1));
		System.out.println(l);
	}

}
