
//Display Fibonacci Series ...

//			0, 1, 1, 2, 3, 5, 8, 13, 21, ....

import java.util.Scanner;
public class Fibonacci_Series{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter where you want to end : ");
		int n = sc.nextInt();
		
		int x = 0;
		int y = 1;
		int z = y;
		
		System.out.println("Fibonacci series : ");
		System.out.print("\n\t"+x+" "+y+" ");
		
		for(int i=1;i<=22;i++)
		{
			y = x + y;
			if(y<=n)
			System.out.print(y+" ");
			z = y + z;
			x = z;
			if(z<=n)
			System.out.print(z+" ");	
		}
	}
}
		