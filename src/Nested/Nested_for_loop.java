package Nested;

public class Nested_for_loop {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) //outer row i= 1,2,3
		{
			for(int j=1; j<=5;j++) // inner col j= 1,2,3,4,5,1,2,3,4,5
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
