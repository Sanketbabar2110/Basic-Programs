
/*Display all combinations of (1, 2, 3) like repeatation is allowed
 *
 *			111, 112, 113, 121, 122, ....... 
 */
 
 public class Combination{
	 public static void main(String[]args)
	 {
		System.out.println("\nCombinations are : ");
		 int i, j, k;
		 int c=0;
		 
		 for(i=1;i<=3;i++)
		 {
	  		 for(j=1;j<=3;j++)
			 {
				 for(k=1;k<=3;k++)
				 {
					 c++;
					 System.out.print(i+" "+j+" "+k+"\t");
				 }
			 }
		 }
		 System.out.print("\n\nTotal number of combinations : "+c);
	 }
 }
