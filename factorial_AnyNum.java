
//Accept any number 'n' and calculate it's factorial

import java.util.Scanner;
public class factorial_AnyNum{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		int f = 1;
		
		for(int i=n;i>=1;i--)
		{
			f = f*i;
		}
		System.out.print("factorial of "+n+" : "+f);
	}
}