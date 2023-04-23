package functional_programming;

import java.util.function.BiFunction;
import java.util.function.Function;

//it takes two arguments(argument type,return type) and use apply(T,R)

public class Function1 {

	public static void main(String[] args) {
		//Ex-1:- 4,3 = 16-9=7
//		BiFunction<Integer, Integer, Integer> bi= (a,b) -> (a*a)-(b*b);
//		System.out.println(bi.apply(4, 3));
		
		//find the length of the string, "Raman" 5
		Function<String, Integer> f= s-> s.length();
		System.out.println(f.apply("Raman"));
		
	}
	
}
