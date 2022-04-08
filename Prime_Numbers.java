
//Accept number and find it is prime number or not

/*Prime number : 
					A prime number is a whole number greater
	then 1; but it can be divided by only one and the number
	itself.
*/

import java.util.Scanner;
public class Prime_Numbers{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		int a = 0;
		int i;
	 
		if( n == 2 )
		{
			System.out.print("\nThe number is prime number");
			return;
		}
	 
		for(i=2;i<=(n-1);i++)
		{
			a = n%i;
			if(a==0)
			{
				System.out.print("\nThe number is not Prime number");
				break;
			}
			else
			{
				System.out.print("\nThe number is prime number");
				break;
			}
		}	
	}
}   
		