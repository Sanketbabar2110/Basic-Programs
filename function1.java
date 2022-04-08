
//functions and Methods


//Create Subtraction function with passing parameter with 
//  returning value

import java.util.Scanner;
public class function1{
	
		public static int subtrac(int x, int y)
		{
			int z = x-y;
			
			return z;
		}
		
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);
			int a, b, c;
			
			System.out.println("Enter two values :");	
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = subtrac(a,b);
			
			System.out.print("Subtraction of two numbers : "+c);
			sc.close();
		}
}
			
			
		