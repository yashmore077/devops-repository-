package com.ifelse;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {

		float amount,discount;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter amount");
		amount=sc.nextFloat();

		if(amount>=5000)
		{
			discount=amount*10/100;
			amount=amount-discount;
			System.out.println("Applied discount for your items : "+discount);

		}
		else
		{
			System.out.println("no discount is apllied");

		}


	}

}
