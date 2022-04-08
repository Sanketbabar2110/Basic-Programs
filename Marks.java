
//Accept five subject marks and calculate total marks and
//average marks

import java.util.Scanner;
public class Marks{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		
		for(int i=1;i<=5;i++)
		{
			System.out.print("Enter number : ");
			int num = sc.nextInt(); 
			tot = tot + num;
		}
		System.out.println("\nTotal marks : "+tot);
		System.out.println("Average marks : "+(tot/5));
	}
}
			
			
			