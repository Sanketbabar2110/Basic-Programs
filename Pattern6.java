
/*Pattern6
 *			5 4 3 2 1
 *			5 4 3 2
 *			5 4 3
 *			5 4
 *			5
*/

public class Pattern6{
	public static void main(String[]args)
	{
		int i, j;
		
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
		}
	}
}