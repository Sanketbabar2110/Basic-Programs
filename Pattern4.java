
/*Pattern4
 *				1
 *				1 1
 *				1 1 1
 *				1 1 1 1
 *				1 1 1 1 1
*/

public class Pattern4{
	public static void main(String[]args)
	{
		int i, j;
		int s = 1;
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			for(j=i;j>=1;j--)
				System.out.print(s+" ");
		}
	}
}
	