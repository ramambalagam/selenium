package stringmethods;

public  class duplicate {
	public static void main (String[] args) {
	
		occurnaces();
		 nonrepitative();

}
	
	public static void occurnaces() {
	
	String var = "ramam";
	System.out.println(var);
	int varlen = var.length(); 
	
	
	
	for ( int i = 0;i<varlen;i++)
	{
		int count = 0;
		for ( int j = 0; j<varlen;j++) {
			
			if (var.charAt(i)==var.charAt(j)) 
			{
			count++;
	}
			   	
			}
			
	
		
		System.out.println("no of occuerance "+var.charAt(i)+"--"+count);
		
	}
}
	
	public static void nonrepitative() {
		
		String name = "ramambalagam";
		int namelen = name.length();
		 String nonname ="";
		for (int i = 0; i<namelen;i++)
		{
			 int count1 = 0;
			
			
			for ( int j = 0; j<namelen;j++) {
				
				if(name.charAt(i)==name.charAt(j)) {
					
					count1++;
				}
				
			
					
			}
			if (count1 >1)
				
				nonname =nonname+name.charAt(i);
			
			
		}
		System.out.println(nonname);
		
	}
	
	public static void specialchar() {
		
		
		
	}


}