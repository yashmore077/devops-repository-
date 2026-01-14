package com.exception;


class AgeException 
{
	void valid(int age) throws Exception
	{
		if(age>=18)
		{
			System.out.println("valid age");
		}
		else
		{
			throw new Exception("invalid age ");

		}
	}
}


public class Age_Exception {

	public static void main(String[] args) {
		AgeException a1=new AgeException();

		try
		{
			a1.valid(12);

		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());

		}

	}

}
