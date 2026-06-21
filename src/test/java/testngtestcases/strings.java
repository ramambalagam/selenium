package testngtestcases;

public class strings {
	
	public static void main(String [] args) {
	
	String var = "ramam";
	int varlen = var.length();
	
	String newchar ="";
	System.out.println(varlen);
	
	for ( int i =0;i<varlen;i++)
	{
		int count = 0;
		
		for ( int j=0; j<varlen;j++) {
		
			if (var.charAt(i)==var.charAt(j))
			{
				count++;
			
					}
		}
			
		if(count>1) {
		 newchar= newchar+var.charAt(i);
		
		}
	}
	System.out.println(newchar);
}
}


