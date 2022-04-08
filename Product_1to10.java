
//Calculate Multiplication of 1 to 10 Numbers

public class Product_1to10{
	public static void main(String[]args)
	{
	//	by using while loop
	
		int i = 1;
		int m = 1;
		
		while(i<=10)
		{
			m = i*m;
			i++;
		}
		System.out.println("Multiplication : "+m);
		
	//	by using for loop
	/*	m = 1;
		
		for(int i=1;i<=10;i++)
		{
			m = i*m;
		}
		System.out.println("Multiplication : "+m);
	*/	
	}
}
		