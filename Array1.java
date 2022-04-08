
//Create an array having five elements store vlaues into it and 
//	perform following actions:

public class Array1{
	public static void main(String[]args)
	{
		
//int[] x = new int[5];
		
		int[] x ={100,200,300,400,500};	//Declaration,creation and initialization
		
//Display array length
		
		System.out.print("Array length : "+x.length);
		
//Display all elements in array
		
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print("\nElement in Array at index "+i+" : "+x[i]);
		}
		
//Display elements in reverse order
		
		System.out.print("\n\nElements of Array in reverse order : ");
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print("  "+x[i]);
		}
		
//Calculate Square of every element and display
		
		System.err.print("\n\nSquares : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("\nSquare of element in Array at index "+i+" : "+(x[i]*x[i]));
		}
		
//Calculate cube of every element and store into new array
		
		int[] a = new int [x.length];
		System.err.print("\n\nCubes : ");
		for(int i=0;i<x.length;i++)
		{
			a[i] = x[i]*x[i]*x[i];
			System.out.print("\nCube of element in Array at index "+i+" : "+a[i]);
		}
		
//Copy one array into another array
		
		System.out.print("\n\nCopy one array elements into another array : ");
		for(int i=0;i<x.length;i++)
		{
			a[i] = x[i];
			System.out.print("  "+a[i]);
		}
	}
}
		
		
		