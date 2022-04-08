
/*Pattern27
 *			  *   *   *   *   *
 *			    *   *   *   *
 *			      *   *   *
 *			        *   *
 *			          *
 *			        *   *
 *			      *   *   *
 *			    *   *   *   *
 *			  *   *   *   *   *
 */
 
public class Pattern27{
	public static void main(String[]args)
	{
		int i, j;
		
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print(" *  ");
			}
		}
		for(i=2;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=5;j>=i;j--)
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