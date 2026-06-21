package Inheritance;

public class polymorphEzampl {

	public static void main(String [] args) {
		
		animal an = new cat();
		an.eat();
		animal am = new animal();
		am.eat();
		cat c = new cat();
		c.cal(1,2,3);
		c.cal(1, 2);
	}
}
