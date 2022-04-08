
//Accept any number and find maximum and minimum digit

import java.util.Scanner;
public class MaxMin_Digits{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		
		int max=0;
		int min=9;
		
		for(int i=1;n!=0;i++)
		{
			int a = n%10;
			if(a>max)
			{
				max = a;
			}
			else if(a<min)
			{
				min = a;
			}
			n = n/10;
		}
		System.out.print("\nMaximum digit : "+max);
		System.out.print("\nMinimum digit : "+min);

	}
}