package stringmethods;

import java.util.HashMap;
import java.util.Map;

public class usingbuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String var = "ramambalagam123@gmail.com";

	        Map<Character, Integer> map = new HashMap<>(); 

	        StringBuilder letters = new StringBuilder();
	        StringBuilder digits = new StringBuilder();
	        StringBuilder special = new StringBuilder();

	        // ✅ Single loop (O(n))
	        for (char ch : var.toCharArray()) {

	            // count occurrences
	            map.put(ch, map.getOrDefault(ch, 0) + 1);

	            // classify characters
	            if (Character.isLetter(ch)) {
	                letters.append(ch);
	            } else if (Character.isDigit(ch)) {
	                digits.append(ch);
	            } else {
	                special.append(ch);
	            }
	        }

	        // ✅ Print occurrences (only once per char)
	        System.out.println("Character Count:");
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }

	        // ✅ Repeated & non-repeated
	        StringBuilder repeated = new StringBuilder();
	        StringBuilder nonRepeated = new StringBuilder();

	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > 1) {
	                repeated.append(entry.getKey());
	            } else {
	                nonRepeated.append(entry.getKey());
	            }
	        }

	        System.out.println("Repeated chars: " + repeated);
	        System.out.println("Non-repeated chars: " + nonRepeated);
	        System.out.println("Only letters: " + letters);
	        System.out.println("Only digits: " + digits);
	        System.out.println("Special chars: " + special);
	    }
	
}

