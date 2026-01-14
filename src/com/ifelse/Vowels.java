package com.ifelse;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		char ch;
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


	}

}
