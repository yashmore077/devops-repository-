package com.Switch_Case;
import java.util.Scanner;

public class Practice_switchcase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c,n,option;
		char ans,ch;
		do
		{
			System.out.println("--------press 1 for ODD/EVEN   -----");
			System.out.println("--------press 2 for Greater No.-----");
			System.out.println("--------press 3 for vowels     -----");

			System.out.println("***enter an option*** ");
			option=sc.nextInt();
			switch(option)
			{
			case 1: 

				System.out.println("Enter value");

				n=sc.nextInt();

				if(n%2==0)
				{
					System.out.println("value is even");

				}
				else
				{
					System.out.println("value is odd");
				}
				break;

			case 2:

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
				break;
			case 3:
				System.out.println("enter a character");
				ch=sc.next().toUpperCase().charAt(0);
				System.out.println(ch);
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					System.out.println("vowel");
				}
				else
				{
					System.out.println("consonent");

				}
				break;
			default:
				System.out.println("*****invalid option****");


			}
			System.out.println("do you want to continue? if yes, press y");
			ans=sc.next().charAt(0);
		}
		while(ans=='y');


	}

}
