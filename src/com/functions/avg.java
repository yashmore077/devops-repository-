package com.functions;
import java.util.Scanner; 

public class avg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,g;
		System.out.println("enter 3 number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		g= avg(a,b,c);
		System.out.println("greater no. is"+g);
		
	}
	static int avg(int a ,int b, int c)
	{
		if(a>b && a>c)
		{
			return a; 
		}
		else if(b>a && b>c)
		{
			return b;
			
		}
		else
		{
			return c;
		}
		
		
	}

}
