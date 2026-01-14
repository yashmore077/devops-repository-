package com.functions;
import java.util.Scanner;

public class method3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a,b,c;System.out.println("enter 2 no.");
		a=sc.nextInt();
		b=sc.nextInt();
		c=add(a,b);
		System.out.println("addition is"+c);



	}
	static int add(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}

}
