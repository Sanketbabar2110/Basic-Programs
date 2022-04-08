
//Accept three any numbers and display larger numbers

import java.util.Scanner;
public class LargerNum{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter number : ");
		int n2 = sc.nextInt();
		
		System.out.print("Enter number : ");
		int n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("\nLarger number = "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("\nLarger number = "+n2);
		}
		else
		{
			System.out.println("\nLarger number = "+n3);
		}
	}
}