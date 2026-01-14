package com.loop;
import java.util.Scanner;
public class while_3 {

	public static void main(String[] args) {
		
		int a, b, c ;
		char ans;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter 2 no :");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("addition is = "+c);
		
		System.out.println("Do you want to continue? press y");
		ans=sc.next().charAt(0);
		}
		while(ans=='y');
		

	}

}
