
//Calculate area of Circle, Rectangle and Tringle

import java.util.Scanner;
public class function4{
		
	public static double circle(int r)
	{
		double carea = 3.142*r*r;
		
		return carea;
	}
	
	public static int rectangle(int l, int b)
	{
		int rarea = l*b;
		
		return rarea;
	}
	
	public static double triangle(int base, int h)
	{
		double tarea = base * h *1/2;
		
		return tarea;
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int r = sc.nextInt();
		
		System.out.println("Enter length and bredth of rectangle : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter base and height of tringle : ");
		int base = sc.nextInt();
		int h = sc.nextInt();
		
		double carea = circle(r);
		int rarea = rectangle(l, b);
		double tarea = triangle(base, h);
		
		System.out.println("\nArea of circle : "+carea);
		System.out.println("Area of Rectangle : "+rarea);
		System.out.println("Area of Triangle : "+tarea);
	}
}
		