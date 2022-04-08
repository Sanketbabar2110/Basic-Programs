
//Accept value's of (x and Y) and solve following Expression
//			z = (4x^2 + 5y^3)/2xy;

import java.util.Scanner;
public class Solve{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of x : ");
		float x = sc.nextFloat();
		
		System.out.print("Enter value of y : ");
		float y = sc.nextFloat();
		
		float z = ((4*x*x)+(5*y*y*y))/(2*x*y);
		
		System.out.println("\n z = "+z);
	}
}