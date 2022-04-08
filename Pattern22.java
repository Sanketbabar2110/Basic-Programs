
/*Pattern22
 *					             1
 *					          1  2  1
 *					       1  2  3  2  1
 *					    1  2  3  4  3  2  1
 *					 1  2  3  4  5  4  3  2  1
 *					    1  2  3  4  3  2  1
 *					       1  2  3  2  1
 *					          1  2  1
 *					             1
 */
 
public class Pattern22{
	public static void main(String[]args)
	{
		int i, j;
		
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=5;j>i;j--)
			{
				System.out.print("   ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print("  "+j);
			}
			for(j=i;j>=1;j--)
			{
				System.out.print("  "+j);
			}
		}

		for(i=5;i>1;i--)
		{
			System.out.print("\n");
			
			for(j=5;j>=i;j--)
			{
				System.out.print("   ");
			}
			for(j=1;j<(i-1);j++)
			{
				System.out.print("  "+j);
			}
			for(j=(i-1);j>=1;j--)
			{
				System.out.print("  "+j);
			}
		}
	}
}