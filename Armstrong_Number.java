
//Accept number and find it is Armstrong number or not

/*Armstrong Number :
					An aremstrong number is positive 'n'-digit
  number that is equal to the sum of the 'nth' power of their
  digits.
 *			it is also known as 'Pluperfect' or 'Plus Perfect' 
  or 'Narcissistic' number.
 
 *For example: *	1^1 = 1
					2^2 = 2
					153 = 1^3 + 5^3 + 3^3 = 1+125+27 = 153
					125 = 1^3 + 2^3 + 5^3 = 1+8+125 = 134
				(125 is not an Armstrong number)
			Examples: 153,370, 371, 407, 1634, 8208, 9474 etc.
*/

import java.util.Scanner;
public class Armstrong_Number{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		int n1 = n;
		int a;
		int tot = 0;
		int i = 1;
		int c = 0;
		
		for(i=1;n1!=0;i++)
		{
			c++;
			n1 = n1/10;
		}
		
		switch(c)
		{
			case 1:
			{
				tot = 0;
				n1 = n; 
				for(i=1;n1!=0;i++)
				{
					a = n1%10;
					tot = tot + a;
					n1 = n1/10;
				}
				if(n==tot)
				System.out.print("\nThe number is Armstrong number.");			
				else
				System.out.print("\nThe number is not an Armstrong number.");	
			}
			break;
			
			case 2:
			{
				tot = 0;
				n1 = n; 
				for(i=1;n1!=0;i++)
				{
					a = n1%10;
					tot = tot + a*a;
					n1 = n1/10;
				}
				if(n==tot)
				System.out.print("\nThe number is Armstrong number.");			
				else
				System.out.print("\nThe number is not an Armstrong number.");
			}
			break;
			
			case 3:
			{
				tot = 0;
				n1 = n; 
				for(i=1;n1!=0;i++)
				{
					a = n1%10;
					tot = tot + a*a*a;
					n1 = n1/10;
				}
				if(n==tot)
				System.out.print("\nThe number is Armstrong number.");			
				else
				System.out.print("\nThe number is not an Armstrong number.");
			}
			break;
			
			case 4:
			{
				tot = 0;
				n1 = n; 
				for(i=1;n1!=0;i++)
				{
					a = n1%10;
					tot = tot + a*a*a*a;
					n1 = n1/10;
				}
				if(n==tot)
				System.out.print("\nThe number is Armstrong number.");			
				else
				System.out.print("\nThe number is not an Armstrong number.");
			}
			break;
			
			case 5:
			{
				tot = 0;
				n1 = n; 
				for(i=1;n1!=0;i++)
				{
					a = n1%10;
					tot = tot + a*a*a*a*a;
					n1 = n1/10;
				}
				if(n==tot)
				System.out.print("\nThe number is Armstrong number.");			
				else
				System.out.print("\nThe number is not an Armstrong number.");
			}
			break;
			
		}
	}
}