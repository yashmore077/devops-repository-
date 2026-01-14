package Nested;

public class alphabet_triangle {

	public static void main(String[] args) {
		//int n=65;
		char n= 'A';
		for(int i=1; i<=5;i++) //outer row i= 1,2,3
		{
			for(int j=1; j<=i;j++) // inner col j= 1,2,3,4,5,1,2,3,4,5
			{
				//System.out.print((char)n++);
				System.out.print(n++);
			}
			System.out.println();
		}

	}

}
