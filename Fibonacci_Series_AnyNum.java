
//Accept any two numbers and display fibonacci series

import java.util.Scanner;
public class Fibonacci_Series_AnyNum{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int x = sc.nextInt();
		
		System.out.print("Enter any number : ");
		int y = sc.nextInt();
		
		System.out.print("Enter where you want to end : ");
		int n = sc.nextInt();
		
		int z = y;
		System.out.print("\nFibonacci series : ");
		System.out.print("\n\t"+x+" "+y+" ");
		for(int i=1;i<=22;i++)
		{
			y = x + y;
			
			if(y<=n && y>0)
			System.out.print(y+" ");
			
			z = y + z;
			x = z;
			
			if(z<=n && z>0)
			System.out.print(z+" ");
		}
	}
}