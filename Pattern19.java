
/*Pattern19
 *					             1
 *					          5  1  2
 *					       4  5  1  2  3
 *					    3  4  5  1  2  3  4
 *					 2  3  4  5  1  2  3  4  5
 */

 public class Pattern19{
	 public static void main(String[]args)
	 {
		 int i, j;
		 
		 for(i=1;i<=5;i++)
		 {
			 System.out.print("\n");
			 
			 for(j=i;j<5;j++)
			 {
				 System.out.print("   ");
			 }
			 for(j=7-i;j<=5;j++)
			 {
				 System.out.print("  "+j);
			 }
			 for(j=1;j<=i;j++)
			 {
				 System.out.print("  "+j);
			 }
		 }
	 }
 }