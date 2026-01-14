package com.ifelse;
import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("positive");
			
		}
		else
		{
			System.out.println("negative");
		}
	}

}
