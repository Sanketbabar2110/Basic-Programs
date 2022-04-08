
//Accept any number and display it is odd or even number

import java.util.Scanner;
public class Odd_Even{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("\nThe number is Even");
		}
		else
		{
			System.out.println("\nThe number is Odd");
		}
	}
}  