package wrapper_class;

import java.util.ArrayList;

public class Day14Part4 {

	public static void main(String[] args) {
		Integer i=new Integer(20); // 20 is primitve datatype( of int type)
		//Integer i3=Integer.valueOf(20);//primitive to wrapper
		
		// internally calls valueOf() 
		//Integer i3=Integer.valueOf(20)
//		Integer i3=20; // Autoboxing
//		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(30);
		
		//wrapper to primitive
		// UnBoxing
		Integer i1=new Integer(20);
		int i2=i1.intValue();
		System.out.println(i2);
		
		Integer i3=20; // AutoBoxing --[ primitive to wrapper ]
		int i4=i3; // AutoUnboxing -- [ wrapper to primtive ]
		
		

	}

}
