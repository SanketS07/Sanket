package democlass1;

public class star1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)       // here i for rows.
		{
			for(int j=4; j>=i; j--)   // here j for coloums.
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
