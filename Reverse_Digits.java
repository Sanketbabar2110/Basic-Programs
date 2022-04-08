
//Accept any number and display in reverse order

import java.util.Scanner;
public class Reverse_Digits{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		int rev = 0;
		for(int i=1;n!=0;i++)
		{
			int a = n%10;
			rev = rev*10 + a;
			n = n/10;
		}
		System.out.print("\nNumber in reverse order : "+rev);
	}
}
		