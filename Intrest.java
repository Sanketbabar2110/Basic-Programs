import java.util.Scanner;
public class Intrest{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lone amount : ");
		double lone = sc.nextDouble();
		
		double intrest = lone*12/100;
		
		System.out.print("\nIntrest amount per annum : "+intrest);
	}
}