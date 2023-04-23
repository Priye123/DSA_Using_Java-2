package functional_programming.predicate;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {

		// Ex-1
//		Predicate<Integer> pr= n-> n>10;
//		System.out.println(pr.test(10));

		// Ex-2
//		Predicate<String> pr1= s->s.length()>4;
//		System.out.println(pr1.test("Ram"));

		// Ex3:- print string array elements whose size>4 from that array
		String names[] = { "Raman", "Sami", "Sameer", "Sam", "Priye" };
		Predicate<String> pr = s -> s.length() > 4 && s.equals("Sameer");
		for (String name : names) {
			if (pr.test(name))
				System.out.println(name);
		}

	}
}
