//package functional_programming;
//
//import java.util.ArrayList;
//import java.util.function.BiFunction;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//
//class Employee {
//
//	String ename;
//	int salary;
//	int experience;
//
//	public Employee(String ename, int salary, int experience) {
//		this.ename = ename;
//		this.salary = salary;
//		this.experience = experience;
//	}
//
//}
//
//public class FunctionWithUserDefined {
//
//	public static void main(String[] args) {
//		ArrayList<Employee> al = new ArrayList<>();
//		al.add(new Employee("John", 50000, 5));
//		al.add(new Employee("Mohn", 20000, 2));
//		al.add(new Employee("Rohn", 30000, 3));
//		al.add(new Employee("Tohn", 35000, 4));
//		al.add(new Employee("Chohn", 15000, 1));
//		al.add(new Employee("Yohn", 12000, 6));
//
//		// sal:- 10000-20000 range 10% increment
//		// sal:- 20000-30000 20% increment
//		// above 30000,, 30% increment
//
//		Function<Employee, Integer> fn = e -> {
//			int sal = e.salary;
//			if (sal >= 10000 && sal <= 20000)
//				return (sal * 10 / 100);
//			else if (sal >= 20000 && sal <= 30000)
//				return (sal * 20 / 100);
//			else
//				return (sal * 30 / 100);
//		};
//		
//		Predicate<Integer> pr= bonus->bonus>10000;
//		
//		BiFunction<Employee,Integer,Integer> bi=(e,bonus)->{
//			return bonus+e.salary;
//		};
//		
//		for(Employee e:al) {
//			int increment=fn.apply(e);
//			if(pr.test(increment)) {
//				System.out.println(e.ename+"->"+bi.apply(e, increment));
//			}
//		}
//
//	}
//
//}
