package Nested;

public class alphabet_2 {

	public static void main(String[] args) {
		
		char n;
		for(int i=1; i<=5;i++) //outer row i= 1,2,3
		{
			n='A';
			for(int j=1; j<=i;j++) // inner col j= 1,2,3,4,5,1,2,3,4,5
			{
				//System.out.print((char)n++);
				System.out.print(n++);
			}
			System.out.println();
		}

	}

	}


