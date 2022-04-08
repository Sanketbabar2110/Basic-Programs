
//Take input two values and calculate addition

import java.util.Scanner;
public class Addition{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter number : ");
		int b = sc.nextInt();
		
		System.out.println("\nAddition = "+(a+b));
	}
}