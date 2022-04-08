
//Accept number and seprate digites between 0-5 and 6-9 and 
//count also

import java.util.Scanner;
public class Seprate_Digits{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		int a;
		int n1 = n;
		int i;
		int c1=0;
		int c2=0;
		System.out.print("\nDigits between 0 to 5 : ");
		for(i=1;n!=0;i++)
		{
			a = n%10;
			
			if(a>=0 && a<=5)
			{
			System.out.print("   "+a);
			c1++;
			}
			n = n/10;	
		}
		System.out.print("\nTotal count : "+c1);
		
		System.out.print("\nDigits between 6 to 9 : ");
		n=n1;
		for(i=1;n!=0;i++)
		{
			a = n%10;
			
			if(a>5 && a<=9)
			{
			System.out.print("   "+a);
			c2++;
			}
			n = n/10;
		}
		System.out.print("\nTotal count : "+c2);
	}
}