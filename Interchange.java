
//SWAP two numbers without using third variable

import java.util.Scanner;
public class Interchange{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter number : ");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("\nAfter Interchange : "+a+"  "+b);
	}
}