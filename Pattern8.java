
/*Pattern8
 *				5
 *				5 4
 *				5 4 3
 *				5 4 3 2
 *				5 4 3 2 1				
*/

public class Pattern8{
	public static void main(String[]args)
	{
		int i, j;
		
		for(i=5;i>=1;i--)
		{
			System.out.print("\n");
			
			for(j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
		}
	}
}