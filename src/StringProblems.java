import java.util.Scanner;
import java.util.Stack;

public class StringProblems {

	public static void main(String[] args) {
//		I/P:-S=A/B*C
//		O/P:- C/B*A
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Stack<Character> letters=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isLetter(s.charAt(i))) {
				letters.push(s.charAt(i));
			}
			
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				sb.append(letters.pop());
			}else {
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb);
	}

}
