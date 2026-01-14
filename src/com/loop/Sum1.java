package com.loop;
import java.util.Scanner;


public class Sum1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=1,n,sum=0;
		System.out.println("enter a no.");
		n=sc.nextInt();
		while(i<=n)
		{
			
			sum=sum+i;
			i++;
		}
			System.out.println("Sum is"+sum);
			
	}

}
