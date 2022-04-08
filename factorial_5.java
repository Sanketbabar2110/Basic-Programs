
//Calculate factorial of 5

public class factorial_5{
	public static void main(String[]args)
	{
		int i = 5;
		int f = 1;
		
		for(i=5;i>=1;i--)
		{
			f = i*f;
		}
		System.out.print("factorial of 5 : "+f);
	}
}