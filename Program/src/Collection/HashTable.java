package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	
	public static void main(String[] args) {
		
		// HashMap support only one null key and multiple null value
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		
		h.put(51, "LOKESH");
		h.put(90, "DHAGE");
		h.put(44, "ASUS");
		h.put(75, "987");
		h.put(56, "hhh");
		
		for(Map.Entry<Integer , String> e : h.entrySet() )
		{
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue() );
		}
		
		h.put(44, "DELL");
		
		System.out.println("=====================");
		
		for( Map.Entry<Integer , String> e : h.entrySet() )
		{
			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue() );
		}
	}

}
