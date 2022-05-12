package Pro;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n, c, re, s=0;
		
		System.out.println("Enter the Number");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		
		c=n;
		
		while(n>0)
		{
			re = n%10;
			s = (s*10)+re;
			n=n/10;
		}
		
		if(c==s)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}
	
	

}
