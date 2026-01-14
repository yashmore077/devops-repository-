package com.Inheritance;

class A 
{
	int a=100;
	void display()
	{
		System.out.println(" in A"+a);
	}
}

class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(" in B"+b);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		B b1=new B();
		b1.display();
		b1.show();

	}

}
