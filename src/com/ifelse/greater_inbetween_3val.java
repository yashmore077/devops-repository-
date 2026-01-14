package com.ifelse;
import java.util.Scanner;

public class greater_inbetween_3val {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int a,b,c;
		System.out.println("enter 3 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+"is greater");
		}
		else if(b>a)
		{
			System.out.println(b+"is greater");
		}
		else if(a>c)
		{
			System.out.println(a+"is greater");
		}
		else if(c>a)
		{
			System.out.println(c+"is greater");
		}
		else if(b>c)
		{
			System.out.println(b+"is greater");

		}
		else if(c>b)
		{
			System.out.println(c+"is greater");
		}
		else
		{
			System.out.println("values are equal");
		}





	}

}
