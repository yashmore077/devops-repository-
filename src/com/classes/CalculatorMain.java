package com.classes;
import java.util.Scanner;
class Calculator
{
	static void sub(int a , int b)
	{
		System.out.println("substraction is "+(a-b));
	}
	
}

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("enter 2 no.");
		a=sc.nextInt();
		b=sc.nextInt();
		Calculator.sub(a,b);
		
	}

}
