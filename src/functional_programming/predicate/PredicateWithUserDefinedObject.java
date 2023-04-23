package functional_programming.predicate;

import java.util.ArrayList;
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

public class PredicateWithUserDefinedObject {

	public static void main(String[] args) {
		//Employee emp=new Employee("John", 50000, 5);
		
		//emp obj-->return name if sal>30k and exp>3
//		Predicate<Employee> pr= e -> e.salary>30000 && e.experience>3;
//		if(pr.test(emp)) {
//			System.out.println(emp.ename);
//		}

		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("John", 50000, 5));
		al.add(new Employee("Mohn", 20000, 2));
		al.add(new Employee("Rohn", 30000, 3));
		al.add(new Employee("Tohn", 35000, 4));
		al.add(new Employee("Chohn", 15000, 1));
		al.add(new Employee("Yohn", 12000, 6));
		
		Predicate<Employee> pr= e -> e.salary>30000 && e.experience>3;
		for(Employee e:al) {
			if(pr.test(e)) {
				System.out.println(e.ename);
			}
		}
		
	}

}
