
//Calculate total marks for five subjects also calculate average

import java.util.Scanner;
public class function3{
	
	public static int total(int m1, int m2, int m3, int m4, int m5)
	{
			int total = m1 + m2 + m3 + m4 + m5;
			
			return total;
	}
	
	public static double average(int m1, int m2, int m3, int m4, int m5)
	{
		double average = (m1+m2+m3+m4+m5)/5;
		
		return average;
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks in five subject : ");
		int m1, m2, m3, m4, m5;
		int total;
		double average;
		
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		
		total = total(m1, m2, m3, m4, m5);
		
		average = average(m1, m2, m3, m4, m5);
		
		System.out.println("\nTotal marks = "+total);
		System.out.println("Average marks = "+average);
		sc.close();
	}
}