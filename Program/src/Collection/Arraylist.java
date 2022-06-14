package Collection;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList(); // arrayList can change size
		
		a.add(1234);
		a.add("LOKESH");
		a.add('C');
		a.add(54.3);
		a.add("LOKESH");
		
	//	System.out.println(a.size()); // to print arrayList size
		
		for(int i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) + ", ");
		}
		
		a.remove(1);
		a.add(0,"lok");
		System.out.println("");
		
		for(int i = 0; i < a.size(); i++)
		{
			System.out.print(a.get(i) + ", ");
		}
	}

}
