package com.loop;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		int number;
		System.out.print("enter value");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		
		for(int i=1; i<=10 ; i++)
			
			System.out.println(number+ " * " +i+ " = " +(number * i));
		
		
		
		
		
}
}
