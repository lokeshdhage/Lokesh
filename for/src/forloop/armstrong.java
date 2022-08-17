package forloop;

import java.util.Scanner;

public class armstrong {
	
	public static void main(String[] args) {
		
		int n,rem,arm=0,c;
		System.out.println("Enter the number");
		
		Scanner r= new Scanner(System.in);
		n=r.nextInt();
		c=n;
		
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;  //27+125+1=153
			n=n/10;
		}
		if(c==arm)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("is not Armstrong number");
		}
		
		
	}
	
}
