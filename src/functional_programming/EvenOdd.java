package functional_programming;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class EvenOdd {
	public static void main(String[] args) {
		// int n = 7;
//		if(n%2==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}

//		Predicate<Integer> pr = n1 -> n1 % 2 == 0;
//		System.out.println(pr.test(8));

		// 2,3:- 2+3 7 se kam hua to false, otherwise true

//		BiPredicate<Integer, Integer> pr=(n1,n2)-> {
//			return (n1+n2)> 7;
//		};
//		
//		System.out.println(pr.test(2, 3));
	
		// 1:- Monday , 3:- Wednesday

//		Function<Integer, String> f= a -> "Monday";
//		System.out.println(f.apply(1));

//		Function<Integer, String> f = a -> {
//			switch (a) {
//			case 0: {
//				return "Sunday";
//			}
//			case 1: {
//				return "Monday";
//			}
//			case 2: {
//				return "Tuesday";
//			}
//			}
//			return "Friday";
//		};
//
//		System.out.println(f.apply(5));

		BiFunction<Integer, Integer, Integer> bi = (a, b) -> a + b;
		System.out.println(bi.apply(20, 40));
	}
}
