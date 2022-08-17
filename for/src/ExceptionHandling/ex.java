package ExceptionHandling;

import java.io.IOException;

public class ex {
	
  public static void main(String[] args) throws IOException{
		
		System.out.println("start");
		int a = 45;
		int b = 0;
		int c = 0;
		
		int d [] = {23, 45, 32, 87, 89};
		
		try
		{
		  c = a/b;
		  System.out.println("hi");
		  System.out.println(d[7]);
		}
		catch(ArithmeticException hjj)
		{
			System.out.println("b is zero");
			try
			{
				 System.out.println(d[7]);
			}
			catch(ArrayIndexOutOfBoundsException lok)
			{
				System.out.println(" index is not present");
			}
		}
		
		catch(Exception e)
		{
			System.out.println("common handling");
		}
		
	
		
		System.out.println(c);
		
  }

}
