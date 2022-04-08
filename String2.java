
//String2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class String2{
	public static void main(String[]args)throws IOException
	{
		String str = "MISSISSIPI";
		
//Accept single character and find into the string
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter any character : ");
		char c = sc.next().toUpperCase().charAt(0);
		
		System.out.print("\nPosition of character in String : ");
		int b=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				System.out.print(i+"  ");
			else
				b++;
		}
		if(b==str.length())
		System.out.print("Sorry, Character is not present in String");
		
//Accept the chatacter and Display how many times repeated into
//	a String
		
		System.out.print("\nEnter any character between [ m i s p ]: ");
			c = sc.next().toUpperCase().charAt(0);
		
		b=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				b++;
		}
		System.out.print("\nTotal number of times the character repeated : "+b);
		
//Accept string and word and find word into that string
		
		System.out.print("\nEnter any Sentence : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String z = br.readLine();
		
		System.out.print("\nEnter any word in \""+z+"\"  : ");
		int index = z.indexOf(sc.next());
		
		if(index == -1)			//When Character is not found metod returns -1
			System.out.print("\nWord not found");
		else
			System.out.print("\nWord found at index : "+index);
		
//take input two different strings and display which greater and Smaller
		
		System.out.print("\nEnter any Sentence : ");
			z = br.readLine();
		System.out.print("\nEnter any Sentence : ");
		String y = br.readLine();
		
		if(z.length()>y.length())
			System.out.print("\nGreater string is : "+z+"\nSmaller string is : "+y);
		else if(z.length()<y.length())
			System.out.print("\nGreater string is : "+y+"\nSmaller string is : "+z);
		else
			System.out.print("\nBoth Strings are equal in size ");
		
		sc.close();
	}
}