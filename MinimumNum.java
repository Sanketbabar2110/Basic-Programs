import java.util.Scanner;
public class MinimumNum{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int min=999999999;
		
		for(int i=1;i<=4;i++)
		{
			System.out.print("Enter number : ");
			int num = sc.nextInt();
			
			if (num<min)
			{
				min=num;
			}
		}
		System.out.println("\nSmaller number : "+min);
	}
}