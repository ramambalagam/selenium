package stringmethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class testhashmap {

	public static void main(String[] args) {
		// HashMap no duplicate key but value can be dupliacte
		//no indexing due to has method
		//hashmap can be implated by map
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//Map mymap = new HashMap();
		//Adding Pairs
		//put method
		
		hm.put(1989, "ramam");
		hm.put(1993, "teja");
		hm.put(1993, "tarra");//latest one will be taken
		hm.put(2018, "Vishnu");
		hm.put(2020, "radhe");
		
		System.out.println(hm);
		
		//size
		System.out.println("size of hashmap " +hm.size());
		//remove
		
		hm.remove(1993);
		System.out.println(hm);
		System.out.println(hm.get(2018));
		
		System.out.println(hm.keySet());// to get all key values
		System.out.println(hm.values());//to get all values
		System.out.println(hm.entrySet());//both keys and values
			
//using for each
		
		for (int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
				
			}
		
		//using iterator
		
		Iterator<Entry<Integer,String>> it =hm.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
	}


