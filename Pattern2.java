
/*Pattern2
 *				1
 *				2 3
 *				4 5 6
 *				7 8 9 10
 *				11 12 13 14 15
*/

public class Pattern2{
	public static void main(String[]args)
	{
		int s = 0;
		for(int i=1;i<=5;i++)
		{
			System.out.print("\n");
			for(int j=1;j<=i;++j)
			{
				s++;
				System.out.print(s+" ");
			}
		}
	}
}