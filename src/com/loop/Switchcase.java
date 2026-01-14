package com.loop;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		int a,b,c,option;
		char ans;
		do
		{

			System.out.println("1. Addition");
			System.out.println("2. Substraction:");


			System.out.println("enter option:");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("enter 2 no:");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a+b;
				System.out.println("addition is"+c);
				break;
			case 2:

				System.out.println("enter 2 no:");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a-b;
				System.out.println("substraction  is"+c);
				break;
			case 3:
				System.out.println("Enter 2 no.");
				a=sc.nextInt();
				b=sc.nextInt();
				c=a*b;
				System.out.println("multiplication is:"+c);
				break;
				
			default:
				System.out.println("invalid option");
			}
			System.out.println("Do you want to continue? press y");
			ans=sc.next().charAt(0);
		}
		while(ans=='y');



	}

}
