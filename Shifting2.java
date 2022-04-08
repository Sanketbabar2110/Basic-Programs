
//Shifting2 : Shifting values to right side

import java.util.Scanner;
import java.util.Arrays;

public class Shifting2{
	public static void main(String[]args)
	{
		int[] x = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.print("\nLength of array is : "+x.length);
		System.out.print("\nOriginal array is : ");
		System.out.print(Arrays.toString(x));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter amount by which you want to shift : ");
		int amount = sc.nextInt();
		
		for(int j=0;j<amount;j++)
		{
			int q = x[x.length-1];
			int i;
			for(i=x.length-1;i>0;i--)
			{
				x[i] = x[i-1];
			}
			x[i] = q;
		}
		System.out.print("\nNew Array : ");
		System.out.print(Arrays.toString(x));
	}
}