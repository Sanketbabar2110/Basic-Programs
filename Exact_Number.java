
//Accept any number and find it is Exact number or not

/*Exact Number :
				The exact number is a number which is equal to
	sum of their factors.
				An exact number is a value that is known with 
	complete certainty that is exact number is can not simplified
	or reduced.
	
 *like :		1km = 1000m //we cannot change it  
 
 *for example :
 
			28 = 1 + 2 + 4 + 7 + 14 = 28
			
		Where, (1, 2, 4, 7, 14) are the factors of the 28.
*/		

import java.util.Scanner;
public class Exact_Number{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		int a;
		int i;
		int s=0;
		
		for(i=1;i<=(n-1);i++)
		{
			a = n%i;
			
			if(a==0)
			{
				s = s + i;	//sum of factors
			}
		}
		
		if(n==s)
		System.out.print("\nThe number is Exact number");
		else
		System.out.print("\nThe number is not an Exact number");
	}
}