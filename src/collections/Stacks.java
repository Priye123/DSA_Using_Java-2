package collections;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<>();
		s.push('a');
		s.push(' ');
		s.push('*');
		s.push('#');
		
		//System.out.println(s);
		
		//System.out.println(s.peek());
		
		s.pop();
		
		//System.out.println(s.peek());
		s.push('&');
		
		s.pop();
		
		s.pop();
		
		s.pop();
		
		s.pop();
		
		System.out.println(s.empty());
		
		try {
			System.out.println(s.peek());
		} catch (Exception e) {
			System.out.println("Stack Underflow");
		}
		
		s.push('^');
		
		System.out.println(s.empty());
		
		System.out.println(s.peek());

	}

}
