package com.ifelse;
import java.util.Scanner;
public class Greater {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int a,b;
		System.out.println("Enter 2 no.");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+"is greater ");
		}
		else
		{
			System.out.println(b+" is greater");
		}


	}

}
