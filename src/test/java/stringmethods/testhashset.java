package stringmethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//hashset in collections
//homo and heterogiun data allowed, means differnt typ of objects
//index not supported
//duplicate eletms not allowed
//only single nulls
//insertion is not posible in set collection
public class testhashset {

	public static void main(String[] args) {
		// delcariton
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		
   // HashSet<String> myset = new HashSet<String>();
    
		myset.add("hash");
		myset.add(100);
		myset.add(null);
		myset.add("hash");
		myset.add(true);
		
		//pritning hashset
		System.out.println(myset); //duplicate are auto eleiminated in hasset
		
		myset.remove(100);
		
		System.out.println(myset);
		
		//insertion not posole in between beacuse of no index
	
		//accesing sepcific element alos not posible
		//convert hashset to array loist
		
		ArrayList mylist = new ArrayList(myset);
	System.out.println(mylist);
	
	
	System.out.println(mylist.get(2));
	
	//reading all elements using for, but noraml will not work due to no index
	
	for(Object x: myset) {
		System.out.println("using for " +x);
	}
	 
	//usngi iteratro
	
	Iterator it =  myset.iterator();
	while(it.hasNext()) {
		System.out.println("using iterator " +it.next());
	}
	//clear all values
	myset.clear();
	System.out.println(myset.isEmpty());
	
	System.out.println("size fo hashset" +myset.size());
	}

}
