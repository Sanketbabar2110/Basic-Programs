
//Accept any number and display result after module by 10

import java.util.Scanner;
public class Module{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();

		int a = num%10;
		
		System.out.println("\nModule by 10 : "+a);
	}
}
