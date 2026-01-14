package com.functions;
import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter number");
		n=sc.nextInt();
		table(n);
		

	}
		static void table(int n)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("i*n");
			}
		}
}
