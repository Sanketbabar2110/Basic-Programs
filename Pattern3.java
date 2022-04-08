
/*Pattern3
 *				1
 *				2 1
 *				3 2 1
 *				4 3 2 1
 *				5 4 3 2 1
*/

public class Pattern3{
	public static void main(String[]args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("\n");
			for(int j=i;j>=1;j--)
				System.out.print(j+" ");
		}
	}
}