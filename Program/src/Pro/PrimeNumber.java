package Pro;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n,Count=0;
		System.out.println("Enter any number");
		
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
		    if(n%i==0)
		    {
		    	Count++;
		    }
		}
		if(Count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}
	
	
	

}
