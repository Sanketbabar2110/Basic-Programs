
//Accpet marks and display pass or fail(passing criteria above
//and equal to 40%

import java.util.Scanner;
public class PassFail{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks : ");
		float m = sc.nextFloat();
		
		if(m<40)
		{
			System.out.println("\nSorry, you are Failed");
		}
		else
		{
			System.out.println("\nCongrats, You are passed");
		}
	}
}