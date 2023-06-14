package practice;

import java.util.Scanner;

/*
 * read a string from the user
 * print the length of it
 * print all the characters dividing it  by a space
 * Find whether character 'a' is present in the string or not
 * 
 */
public class CharAt 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string value");
		String s1=s.next();
		System.out.println(s1.length());
		for(int i=0;i<s1.length()-1;i++)
		{
			System.out.print(s1.charAt(i)+"");
		}
		System.out.println();
		System.out.println(s1.indexOf('a'));

	}

}
