package ExceptionHandling;

public class Exceptionss {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		int a = 45;
		int b = 0;
		int c = 0;
		
		int d [] = {23, 45, 32, 87, 89};
		
		// for Run Time
		try      // exception code
		{
			try 
			{
				System.out.println(d[8]);
			}
			catch( Exception f)
			{
				System.out.println("hello");
			}
			
			c = a/b ;
			System.out.println("hi");
			System.out.println(d[8]);
		}

		catch(ArithmeticException lfd)
		{
			System.out.println("b is equal to 0");
			
			try
			{
				System.out.println(d[8]);	
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
               System.out.println("arry index doesn't exist");
               try
               {
            	   System.out.println(c/b);
               }
               catch(ArithmeticException s)
               {
            	   System.out.println(" lokesh ");
               }
			}
		}
		 
		catch(Exception e)
		{
			System.out.println("common handling");
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("finally");
		}
		
		System.out.println("c = " + c);
	
	}

}
