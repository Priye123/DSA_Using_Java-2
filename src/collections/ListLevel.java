package collections;

import java.util.LinkedList;

public class ListLevel {

	public static void main(String[] args) {

		
		//CRUD
		//Underlying data structure:- Doubly Linked list
		LinkedList<String> name = new LinkedList<>();
		name.add("Ram"); //100
		name.add("Rahul"); //200
		name.add("Rana"); //300
		
		name.addFirst("Daniel"); //400
		
		name.addLast("Ramesh"); //500
		
		name.add(1, "Sanam");
		name.set(4, "Luccas");
		
		name.removeFirst();
		name.removeLast();
		
		System.out.println(name);
		
		System.out.println("---------------------------------");
		for(String s:name) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------");
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		
	}

}


////name is dynamic array
//		List<String> name = new ArrayList<>(6); // creates space for 6 elements
//		name.add("Ram"); // 0th index
//		name.add("Rahul");// 1st index
//		name.add("Rana"); // 2nd index
//		name.add("Sahil");
//		
//		System.out.println(name.get(3));
//
//		// System.out.println(name);
//
//		name.add(2, "Rahim");
//		name.add(1,"Prince");
//		name.set(0, "Priye");//update
//		
//		//System.out.println(name);
//		name.remove(5);
//		//System.out.println(name.get(5));
