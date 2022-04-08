
//Display 0, 2, 4, 6...., 100(Even numbers)

public class Display_EvenNumbers{
	public static void main(String[]args)
	{
	//	by using while loop
		
		int i=0;
		while(i<=100)
		{
			if(i%2==0)
			System.out.println(i);
			i++;
		}
		
	//	by using for loop

	/*	for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
	*/
	}
}