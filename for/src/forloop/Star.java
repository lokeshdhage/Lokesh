package forloop;

public class Star {
	
	public static void main (String[] args) {
		
	for(int a = 1; a <= 9; a++)  // line change 
	{
		for(int b = (10-a); b < 9; b++) // space 10-2=8
		{
			System.out.print(" ");
		}
		
	for(int c = a; c <=9; c++) // star print 1-1=0
	{
		System.out.print("*");
	}
		System.out.println();
	}
	
 }

}
