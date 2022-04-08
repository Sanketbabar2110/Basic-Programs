
//String3

import java.util.Scanner;
import java. util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String3{
	public static void main(String[]args) throws IOException
	{
	/*	
//Accept two strings and compare with each other and display result
//    as equal or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two strings : ");
		String str = sc.next();
		String s = sc.next();
		
		if(str.equals(s))
			System.out.print("\nStrings are equal");
		else
			System.out.print("\nStrings are not equals");
		
//Accept string and find it is palindrome or not

		System.out.print("\nEnter any string : ");
		str = sc.next();
		
		s ="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			s = s + str.charAt(i);
		}
		
		if(str.equals(s))
			System.out.print("\nString is Palindrome");
		else
			System.out.print("\nString is not Palindrome");
		*/
//Accept any string and separate its words

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter any Sentence : ");
		String str = br.readLine();
		
		String[] words = str.split(" ");
		
		//System.out.print(Arrays.toString(words));
		for(int i=0;i<words.length;i++)
		{
			System.out.print("\n"+words[i]);
		}		
	}
}
		