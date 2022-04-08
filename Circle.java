
//Take input radius of circle and calculate area & circumfarance
//of circle

import java.util.Scanner;
public class Circle{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int r = sc.nextInt();
		
		System.out.println("Area of circle : "+(3.142*r*r));
		System.out.println("circumfarance of circle : "+(2*3.142*r));
	}
}
