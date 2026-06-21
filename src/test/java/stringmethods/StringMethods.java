package stringmethods;

public class StringMethods {

	public static void main(String[] args) {
		String s = "values";
		//		String b = new String("welcome");
		//		System.out.println(s);
		//		System.out.println(b);

		//length- returns lenght of a string ie no of charactesr
		String var = "ramam";
		int Len = var.length();
		System.out.println(Len);
		System.out.println("teja".length());

		//concat-joining string
		String s1="welcome";
		String s2 =" to java";
		String s3 =" today";

		System.out.println(s1+s2);;

		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1+s2.concat(s3));
		System.out.println("new way to ".concat("concat"));
		//


		//trim

		String q ="    welcome   ";
		System.out.println(q.length());
		System.out.println(q);
		System.out.println(q.trim());
		System.out.println(q.trim().length());

		//chatAt()- retrun string based on index

		String w = "test";
		System.out.println(w.charAt(3));

		//contains
		
		String y = "querty";
		System.out.println(y.contains("rty"));

		//equals //equalsIgnorecase-string comparison
		String h ="hello";
		String o ="HELLO";
		System.out.println(h==o);
		System.out.println(h.equals(o));
		System.out.println(h.equalsIgnoreCase(o));

	//replace single or multiple sequance of charactes in a string
		
		String p =  "a bix cat of four legs";
	String b=	p.replace('f', 'z');
	System.out.println(b);
	System.out.println(p.replace("four", "five"));
		
	
	}
}
