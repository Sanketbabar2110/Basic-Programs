
/*Pattern26
 *				*
 *				* *
 *				* * *
 *				* * * *
 *				* * * * *
 *				* * * *
 *				* * *
 *				* *
 *				*
 */

public class Pattern26{
	public static void main(String[]args)
	{
		int i, j;
		
		for(i=1;i<=5;i++)
		{
			System.out .print("\n");
			
			for(j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
		}
		for(i=1;i<=4;i++)
		{
			System.out .print("\n");
			
			for(j=4;j>=i;j--)
			{
				System.out.print(" *");
			}
		}
	}
}