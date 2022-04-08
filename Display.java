
//Accept any number and display it is positive or negative

import java.util.Scanner;
public class Display{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		
		if(num<0)
		{
			System.out.print("\nNumber is Negative");
		}
		else
		{
			System.out.print("\nNumber is Positive");
		}
	}
}  