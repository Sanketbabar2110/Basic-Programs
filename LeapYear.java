
//Accept year and display it is leap year or not

import java.util.Scanner;
public class LeapYear{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("\nThe year is leap year");
		}
		else
		{
			System.out.println("\nThe year is not a leap year");
		}
	}
}