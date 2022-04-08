
//Calculate multiplication of 10 to 1 numbers

public class Product_10to1{
	public static void main(String[]args)
	{
	//	by using while loop
		
		int i=10;
		int m=1;
		while(i>=1)
		{
			m = i*m;
			i--;
		}
		System.out.println("Multiplication : "+m);
		
	//	by using for loop
	/*	m = 1;
		
		for(int i=10;i>=1;i--)
		{
			m = i*m;
		}
		System.out.println("Multiplication : "+m);
	*/	
	}
}
		