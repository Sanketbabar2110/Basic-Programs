
//Accept bill amount and calculate 18% GST amount and net amount

import java.util.Scanner;
public class GST{
	public static void main(String[]args)
	{
		double GST, net;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter bill amount : ");
		double bill = sc.nextDouble();
		
		GST = bill * 18/100;
		net = bill + GST;
		
		System.out.println("\n18% GST amount = "+GST);
		System.out.println("Net amount = "+net);
		
	}
}
		