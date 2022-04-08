
//Calculate Area of circle, rectangle and triangle using method 
//Overloading concept

public class MethodOverloading3{
	
	public static void Area(int r)
	{
		double C_area = 3.142 *r*r;
		System.out.print("\n\n\tArea of circle : "+C_area);
		
	}
	
	public static void Area(int l, int b)
	{
		int R_area = l*b;
		System.out.print("\n\n\tArea of rectangle : "+R_area);
		
	}
	
	public static void Area(double base, double height)
	{
		double T_area = base*height*1/2;
		System.out.print("\n\n\tArea of Triangle : "+T_area);
		
	}
	
	public static void main(String[]args)
	{
		Area(10);
		Area(10, 10);
		Area(10.00, 10.00);
	}
}
	