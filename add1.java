import java.util.*;

public class add1
{
	
	
	public static void add()					//  defining a method.
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("\n\n\t Enter 2 numbers ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.print("\n\n\t Addition is " +  c );
	
	}
	public static void main(String ar[] )
	{
		System.out.print("\n\n\t I am learing methods ");
		
		add();
		
	}
}