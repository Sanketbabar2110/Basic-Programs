import java.util.*;

public class add3
{		
	public static void add(int x, int y)					//  defining a method.
	{
		int z;
		z = x + y ;		
		System.out.print("\n\n\t Addition is " +  z );	
	}
	public static void main(String ar[] )
	{
		System.out.print("\n\n\t I am learing methods ");
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("\n\n\t Enter 2 numbers ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		add( a, b) ;
		
		System.out.print("\n\n\t End of program McGraw Bhava !!! ");						
	}
}