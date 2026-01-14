package com.basic;
import java.util.Scanner;

public class area_of_triangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		float area,b,h;
		System.out.println("Enter 2 numbers");
		
		b=sc.nextFloat();
		h=sc.nextFloat();
		area=0.5f*b*h;
		System.out.println("area is"+area);
		

	}

}
