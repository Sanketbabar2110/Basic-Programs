
//Pattern20


public class Pattern20{
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
		 
		 for(i=5;i>1;i--)
		 {
			 System.out.print("\n");
			 
			 for(j=5;j>=i;j--)
			 {
				 System.out.print("   ");
			 }
			 for(j=8-i;j<=5;j++)
			 {
				 System.out.print("  "+j);
			 }
			 for(j=1;j<i;j++)
			 {
				 System.out.print("  "+j);
			 }
		 }
	}
}
