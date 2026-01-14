package com.functions;
import java.util.Scanner;


public class method4 {

	public static void main(String[] args) {
		
		int c;
		c=add();
		System.out.println("addition is "+c);
		

	}
	static int add()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter 2 no.");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		return c;
		
	}

}


