package ExceptionHandling;

public class expmock  {
	
      public static void main(String[] args)  {
    	  
		System.out.println("start");
	    int a = 75; // fix the value
		int b = 10;
		int c = 0;
		
		int d [] = {12, 34, 65, 34}; 
		try
		{
			c = a/b; 
			System.out.println("hi");
			System.out.println(d[8]); // arry bound 
		    System.out.println("lokesh ");
		}
		
		
		catch(ArithmeticException lok)
		{
			System.out.println("b is zero");
			try
			{
				System.out.println(d[8]);
			}
			catch(ArrayIndexOutOfBoundsException hg)
			{
				System.out.println("Array index is not present");
			}
		}
	
		 catch(ArrayIndexOutOfBoundsException lok)
	      {
					System.out.println("Array index is not present");
		  }
			
		catch(Exception e)
		{
			System.out.println("Mock  nov 20");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("lokesh dk");
		}
		System.out.println(c);
		//System.out.println(d[5]);
	}
	

}
