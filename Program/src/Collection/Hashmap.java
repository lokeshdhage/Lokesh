package Collection;

import java.util.HashMap;
import java.util.Map;



public class Hashmap {
	
	public static void main(String[] args) {
		
		// HashMap support only one null key and multiple null value
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(null, "LOKESH");
		h.put(null, "DHAGE");
		h.put(44, "ASUS");
		h.put(75, null);
		h.put(56, null);
		
		for(Map.Entry<Integer , String> e : h.entrySet() )
		{
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue() );
		}
		
		h.put(44, "DELL");
		h.put(null, "dk");
		
		
		System.out.println("=====================");
		
		for( Map.Entry<Integer , String> e : h.entrySet() )
		{
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue() );
		}
	}

}
