
//Accept any number and calculate addition of digits

import java.util.Scanner;
public class Sum_Digits{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = sc.nextInt();
		
		int tot = 0;
		for(int i=1;n!=0;i++)
		{
			int a = n%10;
			tot = tot + a;
			n = n/10;
		}
		System.out.print("Sum of digits : "+tot);
	}
}