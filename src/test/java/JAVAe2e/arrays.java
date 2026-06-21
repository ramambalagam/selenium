package JAVAe2e;

public class arrays {


	
	public static void main (String[] args) {
	
			String var ="hello world"; 
								   
			int lenght =var.length();  
			String  reverse ="";
			for (int a =lenght-1;a>=0;a--) {
				 
					reverse+= var.charAt(a);
		
		}
			System.out.println("the reverse values is"+reverse );
String reverseagain = new StringBuilder(reverse).reverse().toString();
System.out.println("reverse again"+reverseagain);
	

	
	String var2 ="name";
			String rvar ="";
			int var2len = var2.length();
	for ( int a= var2len-1;a>=0;a--) {
		rvar+= var2.charAt(a);
		
		System.out.println(rvar);
		nonduplicate();
		
	}}
	
	
	public static void nonduplicate() {
		
		String var = "ramam";
		int varlen = var.length(); 
		int count =0;
		String newchar ="";
		for ( int i =0;i==varlen-1;i++)
		{
			for ( int j=0; j==varlen-1;i++) {
				
				if (var.charAt(i)==var.charAt(j))
					
				 count= count++;
				
				   	
				}
				
			if(count>1)
				
			 newchar+= var.charAt(i);
			System.out.println(newchar);
			
		}
	}

}


