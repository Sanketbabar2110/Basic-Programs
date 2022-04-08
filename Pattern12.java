
/*Pattern12
 *				 *   *   *   *   *
 *				   *   *   *   *
 *				     *   *   *
 *				       *   *
 *				         *
*/

public class Pattern12{
	public static void main(String[]args)
	{
		int i, j;
		
		for(i=5;i>=1;i--)
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
	}
}
				