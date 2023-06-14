package practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 */
public class Anagram 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two strings to check whether there are anagram or not");
		String s1=s.next();
		String s2=s.next();
		boolean anagram=true;
		
		if(s1.length()!=s2.length())
		{
			System.out.println("These are not anagrams");
		}
		else
		{
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				anagram=false;
		}
		

	}
if(anagram==true) 
{
	System.out.println("These are  anagrams");
}
else
{
	System.out.println("These are not anagrams");
}

}
}
