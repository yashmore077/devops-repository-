package com.classes;
import java.util.Scanner;

class Student
{
	int rollno;
	String name;
	float per;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter rollno , enter name, enter per");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextFloat();
		
	}
	void display()
	{
		System.out.println(" rollno"+rollno+"name"+name+"per"+per);
		
	}
	
}

public class StudentMainClass {

	public static void main(String[] args) {
		
		Student s1;
		s1=new Student();
		
		Student s[]=new Student[3];
		for (int i = 0; i <=2; i++)
		{
			s[i]=new Student();
			s[i].input();
			
			}
		for(int i = 0; i <=2; i++)
		{
			s[i].display();
		}

	}

}
