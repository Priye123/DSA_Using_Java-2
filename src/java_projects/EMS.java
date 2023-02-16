package java_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//POJO Class
//switch-case
//do-while loop
//getter & setter methods
//parameterized constructor

class Employee {

	private String name;
	private int empno;
	private double salary;
	private char gender;

	public Employee(String name, int empno, double salary, char gender) {
		this.name = name;
		this.empno = empno;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empno=" + empno + ", salary=" + salary + ", gender=" + gender + "]";
	}
}

public class EMS {

	public static void main(String[] args) {
		// CRUD--Display
		Scanner sc = new Scanner(System.in);
		int choice;
		List<Employee> l = new ArrayList<>();// Empty

		do {

			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");

			System.out.print("Enter your choice::");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Empoyee name::");
				String name = sc.next();
				System.out.print("Enter Employee id::");
				int empno = sc.nextInt();
				System.out.print("Enter Employee Salary::");
				double salary = sc.nextDouble();
				System.out.print("Enter Employee Gender::");
				char gender = sc.next().charAt(0);

				// Employee e = new Employee(name, empno, salary, gender);
				l.add(new Employee(name, empno, salary, gender));

				break;

			case 2:
				if (l.size() == 0) {
					System.out.println("-------------------------------------");
					System.out.println("No Details found");
					System.out.println("-------------------------------------");
					break;
				}

				System.out.println("The Employee List is listed below::");

				System.out.println("-------------------------------------");
				for (Employee e : l) {
					System.out.println(e.getName() + " " + e.getEmpno() + " " + e.getSalary() + " " + e.getGender());
				}
				System.out.println("-------------------------------------");

				break;

			case 3:
				System.out.print("Enter which employee to search with respect to Employee ID::");
				int empid = sc.nextInt();
				boolean found = false;

				for (Employee e : l) {
					if (e.getEmpno() == empid) {
						System.out
								.println(e.getName() + " " + e.getEmpno() + " " + e.getSalary() + " " + e.getGender());
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("Employee Not found");
				}

				break;

			case 4:
				System.out.print("Enter which employee to delete with respect to Employee name::");
				String n = sc.next();
				int counter = 0;
				boolean found1 = false;

				for (Employee e : l) {
					if (e.getName().equals(n)) {
						found1 = true;
						break;
					}
					counter++;
				}
				if (found1 == true)
					l.remove(counter);
				else
					System.out.println("Employee not found..unable to delete");

				break;

			case 5:

				System.out.print("which employee details u want to update::");
				int eid = sc.nextInt();

				System.out.print("Enter Updated Name::");
				String nm = sc.next();

				System.out.print("Enter updated Salary");
				double sal = sc.nextDouble();

				System.out.println("Enter Updated Gender::");
				char ch = sc.next().charAt(0);

				for (Employee e : l) {
					if (e.getEmpno() == eid) {
						e.setName(nm);
						e.setSalary(sal);
						e.setGender(ch);
					}
				}

				break;

			default:
				if (choice != 0)
					System.out.println("Invalid user choice...please try again");
				else
					System.out.println("Exit Sucessfully..Thanks for using EMS..Bye..Have a nice day");
			}

		} while (choice != 0);

	}

}
