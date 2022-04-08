
/*Pattern18
 *					             1
 *					          2  1  2
 *					       3  2  1  2  3
 *					    4  3  2  1  2  3  4
 *					 5  4  3  2  1  2  3  4  5
 *					    4  3  2  1  2  3  4
 *					       3  2  1  2  3
 *					          2  1  2
 *					             1
 */
 
public class Pattern18{
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
			for(j=i;j>1;j--)
			{
				System.out.print("  "+j);
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("  "+j);
			}
		}	
		
		for(i=4;i>=1;i--)
		{
			System.out.print("\n");
			
			for(j=4;j>=i;j--)
			{
				System.out.print("   ");
			}
			for(j=i;j>1;j--)
			{
				System.out.print("  "+j);
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("  "+j);
			}
		}
	}
}
			