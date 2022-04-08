
//Display 0, 5, 10, 15...., 100 numbers (i.e Dvisible by 5)

public class Divisible_5{
	public static void main(String[]args)
	{
	//	by using while loop
	
		int i=0;
		while(i<=100)
		{
			if(i%5==0)
			System.out.println(i);
			i++;
		}
	//	by using for loop

	/*	for(int i=0;i<=100;i++)
		{
			if(i%5==0)
			System.out.println(i);
		}
	*/
	}
}