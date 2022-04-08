
//Accept two sides of rectangle and calculate area

import java.util.Scanner;
public class Area{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int l = sc.nextInt();
		
		System.out.print("Enter bredth : ");
		int b = sc.nextInt();
		
		System.out.println("\nArea of rectangle : "+(l*b));
	}
}