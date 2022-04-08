
//Take input three values and calculate multiplication

import java.util.Scanner;
public class Product{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter number : ");
		int b = sc.nextInt();
		
		System.out.print("Enter number : ");
		int c = sc.nextInt();
		
		System.out.println("\nMultiplication = "+(a*b*c));
	}
}