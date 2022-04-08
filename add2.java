import java.util.*;

public class add2
{	
	
	public static int add(int x, int y)					//  defining a method.
	{
		int z;
		z = x + y ;		
		return( z );
	
	}
	public static void main(String ar[] )
	{
		System.out.print("\n\n\t I am learing methods ");
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("\n\n\t Enter 2 numbers ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = add( a, b) ;
		
		System.out.print("\n\n\t Addition is " +  c );		
	}
}