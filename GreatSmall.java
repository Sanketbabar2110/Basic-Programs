
//Take any two numbers and display Greater and Smaller number

import java.util.Scanner;
public class GreatSmall{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd number : ");
		int num2 = sc.nextInt();
		
		if(num1<num2)
		{
			System.out.println("\nSmaller number = "+num1);
			System.out.println("Greater number = "+num2);
		}
		else
		{
			System.out.println("\nSmaller number = "+num2);
			System.out.println("Greater number = "+num1);
		}
	}
}