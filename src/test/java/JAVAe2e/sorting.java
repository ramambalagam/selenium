package JAVAe2e;

import java.util.Arrays;

public class sorting {

	
	public static void main(String[] args) {
		int [] arr = {1,3,4,5,2,7,8,10,9};
	
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		String str ="ramam";
		char [] chr = str.toCharArray();
		Arrays.sort(chr);
			String sorted = new String(chr);
			System.out.println(sorted);
				
		
		
		
	}
}
