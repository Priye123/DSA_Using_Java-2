package core_oops;

//Encapsulation :- hide variables and access through methods
class Person1 {
	
	private String name;
	private int age;
	private int roll;
	private char gender;
	private boolean isVote;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isVote() {
		return isVote;
	}

	public void setVote(boolean isVote) {
		this.isVote = isVote;
	}
}


class Person{
	
	public static void main(String[] args) {
		
		Person1 p=new Person1();
		//p.name="Ram";
		
		//p.setName("Ram");
		System.out.println(p.getName());//null
		
		p.setAge(20);
		System.out.println(p.getAge()); //20
		
		System.out.println(p.getRoll()); //0
		
		
	}
}
