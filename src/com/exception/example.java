package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;




public class example {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 no.");
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println(" the answer is "+c);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by 0");
			
		}
		System.out.println("thank you");
		
	}

}
