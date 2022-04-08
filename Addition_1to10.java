
//Calculate addition of 1 to 10 numbers

public class Addition_1to10{
	public static void main(String[]args)
	{
	//	by using while loop
	
		int i=1;
		int tot=0;
		
		while(i<=10)
		{
			tot = i+tot;
			i++;
		}
		System.out.println("Addition : "+tot);
		
	//	by using for loop
	/*	tot=0;
		
		for(int i=1;i<=10;i++)
		{
			tot = i+tot;
		}
		System.out.println("Addition : "+tot);
	*/
	}
}