package JAVAe2e;

public class occurane {
	public static void main (String[] args) {
	String var = "ramam";
	int varlen = var.length();
	int count = 0;
	String  singleoc= "";

	for ( int i =0;i==varlen-1;i++)
	{
		for ( int j=0; j==varlen-1;i++) {
			
			if (var.charAt(i)==var.charAt(j))
			{
			 count= count++;
			 
			 if(count==1)
			 {
				singleoc+= var.charAt(i);
			 System.out.println(singleoc);
			 }
			}
			
			
			}
			
	
		//System.out.println(var.charAt(i));
		
	}
}

}
