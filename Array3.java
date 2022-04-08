
//Initialise all elements of array with 0 i.e int[5]={0,0,0,0,0}
// and perform following programs

import java.util.*;
public class Array3{
	public static void main(String[]args)
	{
		int[] x = new int[5];
		System.out.print("\nSize of the array : "+x.length);
		
		System.out.print("\nElements in array : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
		
//Accept value and Position and store into an array at that
		// position
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter any value and position between 0 to 4 : ");
		int v = sc.nextInt();
		int p = sc.nextInt();
		
		for(int i=0;i<x.length;i++)
		{
			if(p==i)
				x[i] = v;
			System.out.print("  "+x[i]);
		}
		
//Store 5 values Accept values and position
		
		System.out.println("\nEnter any values and positions between 0 to 4 : ");
		for(int i=0;i<x.length;i++)
		{
			int v = sc.nextInt();
			int p = sc.nextInt();
			
			x[p] = v;
		}
		
		System.err.print("\nElements in array : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
		
//Move values to R H S and remove last value(i.e put 0 at last)
		
		for(int j=0;j<2;j++)
		{
			int s = x[x.length-1];
			int i;
			for(i=x.length-1;i>0;i--)
			{
				x[i]=x[i-1];
			}
			x[i]= s;
			//System.out.print("\n  "+x[i]);
		}
		
		System.out.print("\nArray after moving values to R H S is : ");
		for(int i=0;i<x.length;i++)
		{
			//x[x.length-1] = 0;
			System.out.print("  "+x[i]);
		}
		
//Swap values into an array
		
		System.out.print("\nOriginal position and new position in array : ");
		
		int originalPosition = sc.nextInt();
		int newPosition = sc.nextInt();
		  
		int temp = x[originalPosition];
		x[originalPosition] = x[newPosition];
		x[newPosition] = temp;
		
		System.out.println("\nArray after changing position : ");
		System.out.println(Arrays.toString(x));
		sc.close();
	}
}
