package standardproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

}

public class Student {

	String name;
	int roll;
	char gender;
	int age;

	public Student(String name, int roll, char gender, int age) {
		this.name = name;
		this.roll = roll;
		this.gender = gender;
		this.age = age;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Raman", 25, 'M', 11);
		Student s2 = new Student("Chaman", 32, 'M', 12);
		Student s3 = new Student("Daman", 24, 'F', 10);
		Student s4 = new Student("Baman", 25, 'M', 11);
		Student s5 = new Student("Paman", 30, 'F', 17);

		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Collections.sort(list, new SortByAge());
		
		for(Student s:list) {
			System.out.println(s.name + " " + s.roll + " " + s.gender + " " + s.age);
		}

//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(s1.age);
//		list.add(s2.age);
//		list.add(s3.age);
//		list.add(s4.age);
//		list.add(s5.age);
//
//		Collections.sort(list);
//
//		System.out.println(s1.name + " " + s1.roll + " " + s1.gender + " " + list.get(0));
//		System.out.println(s2.name + " " + s2.roll + " " + s2.gender + " " + list.get(1));
//		System.out.println(s3.name + " " + s3.roll + " " + s3.gender + " " + list.get(2));
//		System.out.println(s4.name + " " + s4.roll + " " + s4.gender + " " + s4.age);
//		System.out.println(s5.name + " " + s5.roll + " " + s5.gender + " " + s5.age);

	}

}
