
//Accept base and height of 90 degree triangle and calculate Area

import java.util.Scanner;
public class Triangle{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter base length : ");
		int b = sc.nextInt();
		
		System.out.print("Enter height : ");
		int h = sc.nextInt();
		
		int area = b*h*1/2;
		
		System.out.println("\nArea of triangle : "+area);
	}
}