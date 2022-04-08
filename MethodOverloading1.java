
public class MethodOverloading1
{		
	
	public static void main(String ar[] )
	{
		System.out.print("\n\n\t I am learing methods ");
		
		int a,b;
		double m,n;
		
		a = 50;
		b = 90;
		
		m = 2.2;
		n = 4.4;
		
		add(a,m);
		
		add(m,n);
		
		add( a, b) ;
		
		add( a,b,a);
		
		add(10,20);
		add(10,20,30);
		
		System.out.print("\n\n\t End of program McGraw Bhava !!! ");
		
	}

	public static void add(int x, int y)					//  defining a method.
	{
		int z;
		z = x + y ;		
		System.out.print("\n\n\t Addition of 2 integers is " +  z );	
	}
	public static void add(double x, double y)					//  defining a method.
	{ 
		double z;
		z = x + y ;		
		System.out.print("\n\n\t Addition of 2 double is " +  z );	
	}
	public static void add(int x, double y)					//  defining a method.
	{
		double z;
		z = x + y ;		
		System.out.print("\n\n\t Addition of 1 integers and 1 double is " +  z );	
	}
	public static void add(int x, int y, int z)					//  defining a method.
	{
		int tot;
		tot = x + y + z ;		
		System.out.print("\n\n\t Addition of 3 integers is " +  tot );	
	}
	
}