
//Accept Length, Breadth and height of box and calculate Volume 

import java.util.Scanner;
public class Volume{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length : ");
		int l = sc.nextInt();
		
		System.out.print("Enter Breadth : ");
		int b = sc.nextInt();
		
		System.out.print("Enter Height : ");
		int h = sc.nextInt();
		
		System.out.print("\nVolume of box : "+(l*b*h));
	}
}