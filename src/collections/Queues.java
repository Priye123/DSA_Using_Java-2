package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer> c=new PriorityQueue<>();
		c.add(31);
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(45);
	
		c.remove();
		
		System.out.println(c.peek());
		
		Queue<Integer> c1=new ArrayDeque<>();
		c1.add(31);
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(45);
		
		c1.remove();
		
		System.out.println(c1.peek());
		
		
		
		//System.out.println(c.peek());
//		c.remove();
//		
//		System.out.println(c.peek());
//		
//		c.remove(20);
//		
//		System.out.println(c.peek());
		
		
		
	}

}
