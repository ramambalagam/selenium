package listners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.Listners.class)
public class testcase {
	
@Test	
void testcase1()
{
	System.out.println("test cases");
}
@Test
void testcase2() {

System.out.println("second case");
}
}