package wrapper_class;

class Student {
	// defining fields
	int id;
	String name;

	public static void main(String args[]) {
		Student s1 = new Student();// creating an object of Student
		s1.id=20;
		s1.name="Priye";
		
		//address = package_name.class_name@hashcode (toString() method in Object class)
		System.out.println(s1.toString());//in term of hashcode
		
		//System.out.println(s1.id);// accessing member through reference variable
		//System.out.println(s1.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}