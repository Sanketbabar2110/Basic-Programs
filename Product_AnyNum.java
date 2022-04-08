
//Accept any number and calculate multiplication upto 1

import java.util.Scanner;

public class Product_AnyNum{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		
		int m=1;
		for(int i=num;i>=1;i--)
		{
			m = i*m;
		}
		System.out.print("Multiplication : "+m);
	}
}