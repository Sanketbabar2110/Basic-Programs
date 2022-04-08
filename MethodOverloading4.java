
//"main method" overloading :

public class MethodOverloading4{

	public static void main(int x)
	{
		System.out.print("The value of x is "+x);
	}
	
	public static void main(double y)
	{
			System.out.print("value of y is "+y);
	}
	
	public static void main(String[] args)
	{
		System.out.print("I am in main method");
		//main(10);
		//main(20.25);
	}
}