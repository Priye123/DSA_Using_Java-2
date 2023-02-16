
/*#include <stdio.h>

int main()
{
    //char[] c={'m','a','n'};
    int man,fish,bird;
    return 0;
}

void walk(int man){
    printf("The man must walk");
}

void swim(int fish){
    printf("The fish can swim");
}

void fly(int bird){
    
}*/

//group ko particular naam dena
// reference variable(object name)
//class:- Sammer/Sam is ur name & sammer's body is object.
// noun is a class.
//which takes space is called Object and which is refrenced by any name is called refre

//public class LivingThings {
//
//	//Encapsulation:- make instance variables private,instance methods public
//	private String man,fish,bird; //instance variables
//	
//	public void walk(String man) { //instance methods
//		System.out.println(man +" walk");
//	}
//	
//	public void swim(String fish) {
//		System.out.println(fish + " swim");
//	}
//	
//	public void fly(String bird) {
//		System.out.println(bird + " fly");
//	}
//	
//	public static void main(String[] args) {
//		LivingThings x=new LivingThings();
//		x.walk("Sammer");
//		x.swim("Hilsa");
//		x.fly("Eagle");
//		x.fly("Subhakant");
//	}
//
//}

//Do it have a try..
//class & object
//Mobile :- 4 GB Ram, 64 Gb ROM, 16 MP, mediatak , andriod os ( features are instance variables)
//actions to be taken by featues is called instance methods.
// photoClick(), talk(); playGame();
//Mobile is a class
//moto :- reference of Mobile
//new Mobile(); object :- body of mobile
//Mobile moto=new Mobile();
//Mobile oppo=new Mobile();
//Motorola
//Motorola e4plus=new Motorola();
//E Series is a class
//E e4=new E();

// Animal Class
public class Animal{
	
	//Instance Variables/ features
	//which is more efficient?
	private String name; // instance/non-static variables
	private static int eyes;//object-independent/ static variables
	private int legs;
	private static int nose; //1
	private char gender; // M/F
	//private boolean isSmart;
	
	//actions/instance methods
	public static void smell(int nose) { // 2
		System.out.println("we can smell with "+ nose +" nose");
		//Java me everything is String concatenation
	}
	
	public void see(int eyes) {
		System.out.println("we can see with "+eyes + " eyes");
	}
	
	public static void main(String[] args) {
		Animal human=new Animal();
		//human.eyes=2;
		eyes=2; //dot operator is use to link b/w object for variables/methods for a corresponding class
		human.nose=1;
		human.legs=2;
		human.gender='M';
		human.name="Set";
		
		human.see(eyes);
		smell(eyes);
	
		Animal cow=new Animal();
		cow.legs=4;
		eyes=2;
		cow.gender='F';
		
		cow.smell(eyes);
		// 500 objects :- 2 * 500 = 1000; worth??
		// in 2 lines :- 
		
	}
	
	
}






