
/*Accept three digit number and perform following operation
	*	a. Display all digits seperatly
	*	b. Addition of all digits
	*	c. Display digits in reverse order
	*	d. Display maximum and minimum digit
	*/
	
import java.util.Scanner;
public class Digits{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Three digit number : ");
		int n = sc.nextInt();
		
		int tot = 0;
		int rev = 0;
		int max = 0;
		int min = 9;
		
		System.out.print("\nDigits seperatly : ");
		for(int i=1;n!=0;i++)
		{
			int a = n%10;
			System.out.print("  "+a);
			
			tot = tot + a;
			
			rev = rev * 10 + a;
			
			if(a>max)
			{
				max = a;
			}
			
			if(a<min)
			{
				min = a;
			}
			n = n/10;
		}
		System.out.print("\nAddition of digits : "+tot);
		System.out.print("\nNumber in Reverse order : "+rev);
		System.out.print("\nMaximum Digit : "+max);
		System.out.print("\nMinimum Digit : "+min);
	}
}