package wrapper_class;

public class Day14Part3 {

	public static void main(String[] args) {
		
		// Given :- 20  to --> "20"
		Integer i=new Integer(20);
		String s=i.toString();
		
		// Given:= "30"  to --> 30
		String h="30";
		int k=Integer.parseInt("30");
		System.out.println(k);
		
		// Given 20 wrapper to --> 20 primitve
		Integer i1=new Integer(20); //given
		int i2=i1.intValue();
		System.out.println(i2);
	
		// Given 'c' primitve to --> 'c' wrapper
		char ch='c';
		Character c=Character.valueOf(ch);
		System.out.println(c);
	}

}

//primitive/wrapper to String
//Integer i=new Integer("Raman");
//String s=i.toString();
//System.out.println(s);

//Boolean b=new Boolean(false);
//String s1=b.toString();
//System.out.println(s1);

//warpper to primitve
//Integer I=new Integer(120);
//int i=I.intValue();
//System.out.println(i);

//Character ch=new Character('b');
//char c=ch.charValue();
//System.out.println(c);
