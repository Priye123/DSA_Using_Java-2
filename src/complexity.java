
class Person extends Object{
	String name;
	int rollno;
	static int no_of_eyes=2;
}

public class complexity {

	public static void main(String[] args) {
		Person p=new Person();
		p.name="Rahul";
		Person.no_of_eyes=4;
		System.out.println(p.toString());

	}

}
