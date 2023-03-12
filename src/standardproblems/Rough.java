package standardproblems;

import java.util.Stack;

public class Rough {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.size());//4
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.push(70);
		st.pop();
		System.out.println(st.size());//3
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st.size());//1
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st.size());
	}

}
