
//Accept two different value's and Write a program to SWAP
//these value's (interchange) and then display on the screen

import java.util.Scanner;
public class Swap{
	public static void main(String[]args)
	{
		int t = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter number : ");
		int b = sc.nextInt();
		
		t = a;
		a = b;
		b = t;
		
		System.out.print("\nAfter interchange : "+a+"  "+b);
	}
}