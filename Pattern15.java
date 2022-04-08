
/*Pattern15
 *				  1
 *				  2  1
 *				  2  1  2
 *				  1  2  1  2
 *				  1  2  1  2  1
 */

public class Pattern15{
	public static void main(String[]args)
	{
		int i, j;
		int s=1;
		
		for(i=5;i>=1;i--)
		{
			System.out.print("\n");
			
			for(j=5;j>=i;j--)
			{
				if(s==1)
				{
					System.out.print("  "+s);
					s=2;
				}
				else
				{
					System.out.print("  "+s);
					s=1;
				}
			}
		}
	}
}