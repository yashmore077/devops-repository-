package com.looppractice;
import java.util.Scanner;

public class sumpr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1,n,sum=0;
		System.out.println("enter a number ");
		n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+1;
			i++;
		}
		System.out.println("the sum of the number is"+sum);
		
		

	}

}
