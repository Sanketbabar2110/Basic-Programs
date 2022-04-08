
/*Pattern16
 *					         *
 *					       *   *
 *					     *   *   *
 *					   *   *   *   *
 *					 *   *   *   *   *
 *					   *   *   *   *
 *					     *   *   *
 *					       *   *
 *					         *
 */
 
public class Pattern16{
	public static void main(String[]args)
	{
		int i, j;
		
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" *  ");
			}
		}
		
		for(i=4;i>=1;i--)
		{
			System.out.print("\n");
			
			for(j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" *  ");
			}
		}
	}
}