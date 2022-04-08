
/*Pattern25
 *			                 1
 *			             -2  2  3
 *			         -3  -2  4  5  6
 *			     -4  -3  -2  7  8  9  10
 *			 -5  -4  -3  -2  11  12  13  14  15
 */
 
public class Pattern25{
	public static void main(String[]args)
	{
		int i, j;
		int s=0;
		
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=5;j>i;j--)
			{
				System.out.print("    ");
			}
			for(j=-i;j<-1;j++)
			{
				System.out.print("  "+j);
			}
			for(j=1;j<=i;j++)
			{
				s++;
				System.out.print("  "+s);
			}
		}
	}
}
			