package Nested;

public class triangle_pattern {

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) //outer row i= 1,2,3
		{
			for(int j=1; j<=i;j++) // inner col j= 1,2,3,4,5,1,2,3,4,5
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
