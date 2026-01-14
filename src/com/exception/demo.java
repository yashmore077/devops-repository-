package com.exception;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class demo {

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			
			int a,b,c;
			System.out.println("enter 2 no. ");
			try
			{
				a=sc.nextInt();
				b=sc.nextInt();
				c=a/b;
				System.out.println("ans is "+c);
			}
			catch(Exception e)
			{
				System.err.println(e.getMessage());
				
				
			}
			System.out.println("hello");
		}
		

	}

}
