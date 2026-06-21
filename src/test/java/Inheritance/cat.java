package Inheritance;

public class cat extends animal {

	@Override
	void eat() {
	System.out.println("eats onyl meat");
	}
	
	void cal(int a, int b)
	{
		System.out.println(a+b);
	}
	void cal(int a , int b, int c)
	{
		System.out.println(a+b+c);
	}
}
