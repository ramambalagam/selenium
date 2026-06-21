package stringmethods;

import java.util.HashMap;
import java.util.Map;

public class demobuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var ="ramambalagam123@gmail.com";
		
		StringBuilder letters = new StringBuilder();
		
		StringBuilder numbers = new StringBuilder();
		
		StringBuilder spechars = new StringBuilder();
		
		StringBuilder repeated = new StringBuilder();
		StringBuilder nonreapted =new StringBuilder();
		
		for (char ch: var.toCharArray()) {
			
					
			if(Character.isLetter(ch))
			{
				letters.append(ch);
			}
			
			if(Character.isDigit(ch))
			{
				numbers.append(ch);
			}
			
			if(!Character.isLetterOrDigit(ch)) {
				
				spechars.append(ch);
			}
					
			
			
		}
		
		System.out.println("only leters "+letters);
		System.out.println("only numers "+numbers);
		System.out.println(("only digits " +spechars));
		
		Map<Character, Integer> map = new HashMap();
        
		for (char chr: var.toCharArray()) {
			
			map.put(chr,map.getOrDefault(chr,0)+1);}   
       
		for (Map.Entry<Character, Integer> enter: map.entrySet()) {
			
		System.out.println(enter.getKey() +"--"+ enter.getValue());
			
			if(enter.getValue() >1) {
				
				repeated.append(enter.getKey());
			}
				else {
					nonreapted.append(enter.getKey());
				}
			}
		System.out.println("repeated are "+repeated );
		System.out.println(("non repeated are " +nonreapted));
		}
		


}
