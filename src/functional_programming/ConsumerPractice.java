package functional_programming;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String ename;
	int salary;
	int experience;

	public Employee(String ename, int salary, int experience) {
		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}

}

public class ConsumerPractice {

	public static void main(String[] args) {
		// Ex:-1 Take input as a String and display on the screen
//		Consumer<String> c = s -> System.out.println(s);
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		c.accept(str);

		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("John", 50000, 5));
		al.add(new Employee("Mohn", 20000, 2));
		al.add(new Employee("Rohn", 30000, 3));
		al.add(new Employee("Tohn", 35000, 4));
		al.add(new Employee("Chohn", 15000, 1));
		al.add(new Employee("Yohn", 12000, 6));

		//1.calcaluate bonus(10% increment)
		//print employe details whose bonus> 10000
		
		Function<Employee, Integer> fn= e-> e.salary*10/100; //task1
		Predicate<Integer> pr= bonus -> bonus>3000;//task2
		Consumer<Employee> c= e-> System.out.println(e.ename+" "+e.salary+" "+e.experience);//task-3
		
		for(Employee e:al) {
			int bonus=fn.apply(e);
			//System.out.println(bonus);
			if(pr.test(bonus)) {
				c.accept(e);
			}
		}	
		 
	}

}
