
//Shifting1 : Shifting values to left side

import java.util.Scanner;
import java.util.Arrays;
public class Shifting1{
	public static void main(String[]args)
	{
		int[] s = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.print("\nThe size of array is : "+s.length);
		System.out.print("\nOriginal array is : ");
		System.out.print(Arrays.toString(s));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter amount by which you wanted to shift an array : ");
		int amount = sc.nextInt();
		
		for (int j = 0; j < amount; j++) 
		{
			int a = s[0];
			int i;
			for (i = 0; i < s.length - 1; i++)
			{
				s[i] = s[i + 1];
				//System.out.print("  "+s[i]);
			}
			s[i] = a;
		}
		
		System.out.print("\n\nNew array : ");
		System.out.print(Arrays.toString(s));
		
		
	}
}