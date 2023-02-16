package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {

	public static void main(String[] args) {
		//i/p:-aaabbccc
		//a3b2c3
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Map<Character,Integer> h=new HashMap<>();
		
		for(int i=0;i<s.length();i++)
			h.put(s.charAt(i), h.getOrDefault(s.charAt(i),0)+1);
		
		for(char ch:h.keySet())
			System.out.println(ch+" "+h.get(ch));
		
		
		
		
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			
//			if(h.containsKey(ch)) {
//				h.put(ch, h.get(ch)+1);
//			}else {
//				h.put(ch, 1);
//			}
//		}
		
		
		
	}

}
