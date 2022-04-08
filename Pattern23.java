
/*Pattern23
 *				             1
 *				          1  1  1
 *				       1  1  1  1  1
 *				    1  1  1  1  1  1  1
 *				 1  1  1  1  1  1  1  1  1
 */
 
public class Pattern23{
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
				System.out.print("  "+1);
			}
			for(j=i;j>=1;j--)
			{
				System.out.print("  "+1);
			}
		}
	}
}