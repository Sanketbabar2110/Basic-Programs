
//Take input basic salary of employee & add (H.R.A. 45%)(T.A. 
//25%)(D.A. 30%) also deduct (M.A. 5%)(P.F. 25%) then calculate 
//net salary

import java.util.Scanner;
public class Salary{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary : ");
		double basic = sc.nextDouble();
		
		double hra = basic*45/100;
		double ta = basic*25/100;
		double da = basic*30/100;
		double ma = basic*5/100;
		double pf = basic*25/100;
		
		double net = basic+hra+ta+da-(ma+pf);
		
		System.out.print("\nNet Salary = "+net);
	}
}
