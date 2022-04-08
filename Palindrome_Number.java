
//Accept any number and find number is palindrome or not

/*palindrome number : 
 						palindrome number is a number that
	remains the same when its digits are reversed.like 16461
 *It is symmetrical
*/

import java.util.Scanner;
public class Palindrome_Number{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = sc.nextInt();
		int rev = 0;
		int n1 = n;
		
		for(int i=1;n!=0;i++)
		{
			int a = n%10;
			rev = rev * 10 + a;
			n = n/10;
		}
		
		n = n1;
		if(n==rev)
		{
			System.out.print("\nThe number is Palindrome number");
		}
		else
		{
			System.out.print("\nIt is not a palindrome number");
		}
	}
}
