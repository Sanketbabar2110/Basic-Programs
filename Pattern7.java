
/*Pattern7
 *				 			*
 *			     		 *  *
 *			     	  *  *  *
 *				   *  *  *  *
 *				*  *  *  *  *
*/

 
public class Pattern7{
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
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*  ");
			}
		}
	}
}