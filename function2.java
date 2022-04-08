
//Difine function to calculate volume of box

import java.util.Scanner;
public class function2{
	
	public static int volume(int l,int b, int h)
	{
		int volume = l * b * h;
		
		return volume;
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length, bredth and height of box : ");
		
		int l, b, h;
		int volume;
		
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		
		volume = volume(l, b, h);
		
		System.out.print("Volume of Box is : "+volume);
		sc.close();
	}
}
