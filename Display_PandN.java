
//Take 10 values and display Positive and Negative values

import java.util.Scanner;
public class Display_PandN{
	public static void main(String[]args)
	{
		int i;
		int c1=0;
		int c2=0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter 10 numbers : ");
		for(i=0;i< arr. length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nPositive numbers : ");
		for(i=0;i<arr. length;i++)
		{
			if(arr[i]>0)
			{
				System.out.print("   "+arr[i]);
				c1++;
			}
		}
		System.out.print("\nTotal Positive numbers : "+c1);
		
		System.out.print("\nNegative numbers : ");
		for(i=0;i<arr. length;i++)
		{
			if(arr[i]<0)
			{
				System.out.print("   "+arr[i]);
				c2++;
			}	
		}
		System.out.print("\nTotal Negative numbers : "+c2);
	}
}