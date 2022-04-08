
//Declare an array having five elements and perform follwing programs

import java.util.*;
public class Array2{
	public static void main(String[]args)
	{
		int[] x = {10,-20,83,85,-55};
		
//Display positive and negative numbers and count the numbers
		
		int c = 0;
		System.err.print("\n\nPositive numbers in array : ");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>=0)
			{
				c++;
				System.out.print("  "+x[i]);
			}
		}
		System.out.print("\nCount of positive numbers in array : "+c);
		
		c=0;
		System.err.print("\n\nNegative numbers in array : ");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<0)
			{
				c++;
				System.out.print("  "+x[i]);
			}
		}
		System.out.print("\nCount of negative numbers in array : "+c);
		
//find value between 80 and 90
		
		System.err.print("\n\nElements between 80 & 90 : ");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>80 && x[i]<90)
			{
				System.out.print("  "+x[i]);
			}
		}
		
//Accept a value and search into and array and display it is 
//	present or not also position of value
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter any number(10,-20,83,85,-55) : ");
		int s = sc.nextInt();
		int l = 0;
		for(int i=0;i<x.length;i++)
		{
			if(s==x[i])
			{
				System.out.print("\nYes, it is present in array");
				System.out.print("\nPosition of number in array is : "+i);
			}
			else{				
				l++;
			}
		}	
		if(l == x.length)
		{
			System.out.print("\nNo, number is not present in array");	
		}
		
//Search value into an array and replace this vlaue with 99
		
		System.out.print("\n\nEnter any number(10,-20,83,85,-55) : ");
			s = sc.nextInt();
		System.err.print("\n\nAfter replacement : ");
		for(int i=0;i<x.length;i++)
		{
			if(s==x[i])
			{
				x[i]=99;
			}
			System.out.print("  "+x[i]);
		}
		
//Accept Index number and any number and place that number at
//	that index
		
		System.out.print("\n\nEnter any index number between 0 to 4 : ");
		int z = sc.nextInt();
		System.out.print("\nEnter any number : ");
			s = sc.nextInt();
		
		System.err.print("\nAfter replacement : ");
		for(int i=0;i<x.length;i++)
		{
			if(z==i)
			{
				x[i] = s;
			}
			System.out.print("  "+x[i]);
		}
		
//Search value into an array and delete this value  and put 0 at that 
// location
		
		System.out.print("\n\nEnter any number between(10,-20,83,85,-55) : ");
		s = sc.nextInt();
		
		System.err.print("\n\nAfter replace with 0 : ");
		for(int i=0;i<x.length;i++)
		{
			if(s==x[i])
			{
				x[i] = 0;
			}
			System.out.print("  "+x[i]);
		}
		
//Search value and delete value. But store 0 at the end of array
		//Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter any number between : ");
		 s = sc.nextInt();
		
		int b = 0;
		
		for(int i=0;i<x.length;i++)
		{
			if(s==x[i])
			{
				b=i;
				x[i] = 0;
			}
		}
		
		for(int j=0;j<=b;j++)
		{
			int q = x[0];
			int i;
			for(i=0;i<x.length-1;i++)
			{
				x[i] = x[i+1];
				System.out.print("  "+x[i]);
			}
			x[i] = q;
		}
		
		System.err.print("\n\nAfter Storing 0 at the end : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}	
		sc.close();
	}	
}