package com.loop;
import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=1,n,fact=1;
		System.out.println("enter a no.");
		n=sc.nextInt();
		while(i<=n)
		{
			
			fact=fact*i;
			i++;
		}
			System.out.println("factorial is"+fact);
			
	}

}
