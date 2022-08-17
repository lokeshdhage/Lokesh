package forloop;

public class forloo {
	public static void main(String[] args) {
		for(int a = 1; a <= 5; a++)   // line change
		{
			for(int b = a; b <= 5; b++)		// space
			{
				System.out.print(" ");
				}
			
			
		for(int c = 1; c >= 1; c--)  // star
		   {
			System.out.print(" *");
		   }
		for(int d = a; d > 1;  d--) // double star
		{
			System.out.print("**");
		}
			System.out.println();
			
			
			
		}
		System.out.println();
		{
			for(int a = 1; a <= 5; a++) 
			{
				for(int b = (6-a); b < 5; b++) 
				{
					System.out.print(" ");
				}
			   for(int c = 1; c>= 1; c--) 
			   {
				   System.out.print(" *");
			   }
			   for(int d = a; d < 5; d++) 
			   {
				   System.out.print("**");
			   }
			   System.out.println();
			   
			}
			
		}
		
				
	}
}