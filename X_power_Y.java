
//Accept value of 'x' and 'y' then calculate 'x^y' (x power y)

import java.util.Scanner;
public class X_power_Y{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int x = sc.nextInt();
		
		System.out.print("Enter any number : ");
		int y = sc.nextInt();
		
		int i;
		int s=1;
		
		for(i=1;i<=y;i++)
		{
			s = s * x;
		}
		System.out.print("\nx to the power y : "+s);	
	}
}