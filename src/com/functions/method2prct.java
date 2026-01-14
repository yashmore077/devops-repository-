package com.functions;
import java.util.Scanner;
public class method2prct {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int r;
		
	    System.out.println("enter radius");
	    r=sc.nextInt();
	    area(r);
	    
	    
		
		

	}
	static void area(int r)
	{
		float area;
		area=3.14f*r*r;
		System.out.println("area of circle is "+area);
		
	}

}
