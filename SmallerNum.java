
//Accept any four number and display smaller number 

import java.util.Scanner;
public class SmallerNum{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter number : ");
		int n2 = sc.nextInt();
		
		System.out.print("Enter number : ");
		int n3 = sc.nextInt();
		
		System.out.print("Enter number : ");
		int n4 = sc.nextInt();
		
		if(n1<n2 && n1<n3 && n1<n4)
			System.out.println("\nSmaller number : "+n1);
		
		else if(n2<n1 && n2<n3 && n2<n4)
			System.out.println("\nSmaller number : "+n2);
		
		else if(n3<n1 && n3<n2 && n3<n4)
			System.out.println("\nSmaller number : "+n3);
		
		else
			System.out.println("\nSmaller number : "+n4);
	}
}