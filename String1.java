
//String

public class String1{
	public static void main(String[]args)
	{
		String str = "aeiou";
		
//Display String using loop
		
		System.out.print("\n\nString using for loop : ");
		for(int i=0;i<str.length();i++)
		{
			System.out.print("  "+str.charAt(i));
		}
		
//Count total characters of the string
		
		System.out.print("\n\nTotal no. of characters in string is : "+str.length());
		
//Display reverse String
		
		System.out.print("\n\nString in reverse order is : ");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print("  "+str.charAt(i));
		}
		
//Copy one string into another string
	
		String x = str;
		
		System.out.print("\n\nCopy of one string into another string : ");
		
		for(int i = 0;i<x.length();i++)
		{
			System.out.print("  "+x.charAt(i));
		}
			
//Get input two strings and merge into third String
		
		String y = "pqr";
		String z = str+y;
		System.out.print("\n\nNew third string is : "+z);
		
//find position of character 'u'
		
		char u = 'u';
		System.out.print("\n\nPosition of character 'u' is : ");
		for(int i = 0;i<x.length();i++)
		{
			if(u==x.charAt(i))
			System.out.print("  "+i);
		}
	}
}