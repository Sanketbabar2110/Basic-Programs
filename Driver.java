
//Infosis want's to hire a Driver having following criteria's
//		a. Age must be greater then 40.
//		b. Driving Experience greater then 10 years
//		c. 12th mark's greater then 60.

import java.util.Scanner;
public class Driver{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter driving Experience : ");
		int exp = sc.nextInt();
		
		System.out.print("Enter 12th marks : ");
		int marks = sc.nextInt();
		
		if(age>40 && exp>10 && marks>60)
			System.out.println("\nDriver is hired");
		
		else 
			System.out.print("\ndriver is not hired");
	}
}