package Pro;

public class ReversWords {
	
	public static void main(String[] args) {
		
		String a = "LOKESH KRISHNA DHAGE";
		
		String [] s = a.split(" ");
		
		for(int i = s.length-1; i >= 0; i--)
		{
			System.out.print(s[i] + " ");
		}
	}

}
