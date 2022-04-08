
//Calculate subtraction of 2 ints, 2 doubles, 1 int & 1 double, 1double 
//& 1 int using method overlaoding

public class MethodOverloading2{
	
	public static void subtraction(int x, int y)
	{
		int z = x-y;
			
		System.out.print("\n\n\tSubtraction is : "+z);
	}
	
	public static void subtraction(double x, double y)
	{
		double z = x-y;
			
		System.out.print("\n\n\tSubtraction is : "+z);
	}
	
	public static void subtraction(int x, double y)
	{
		double z = x-y;
			
		System.out.print("\n\n\tSubtraction is : "+z);
	}
	
	public static void subtraction(double x, int y)
	{
		double z = x-y;
			
		System.out.print("\n\n\tSubtraction is : "+z);
	}
	
	public static void main(String[]args)
	{
		subtraction(20, 10);
		subtraction(12.5, 6.5);
		subtraction(20, 12.5);
		subtraction(12.5, 10);
		
	}
}