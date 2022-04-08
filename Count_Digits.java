
//Accept any number and count total digits of number

import java.util.Scanner;
public class Count_Digits{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = sc.nextInt();
		
		int c = 0;
		for(int i=1;n!=0;i++)
		{
			c++;
			n = n/10;
		}
		System.out.print("Number of digites : "+c);
	}
}
			