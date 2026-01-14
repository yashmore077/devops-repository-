package com.Switch_Case;
import java.util.Scanner;

public class Switchcase_multi {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a,b,c,option;
		char ans;
		do
		{

			System.out.println("select option 1 for Addition");
			System.out.println("Select option 2 for Substraction");

			System.out.println("Enter option");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
			System.out.println("enter 2 values:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Answer is:"+c);
			break;
			case 2:
			System.out.println("enter 2 values:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a-b;
			System.out.println("Answer is:"+c);
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
