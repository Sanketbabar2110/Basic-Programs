
/*Pattern9
 *								 1
 *					          1  2
 *					       1  2  3
 *					    1  2  3  4
 *					 1  2  3  4  5
*/

public class Pattern9{
	public static void main(String[]args)
	{
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=5;j>i;j--)
			{
				System.out.print("   ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"  ");
			}
		}
	}
}