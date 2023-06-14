package jsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class B {

	public static void main(String[] args) 
	{
		String s="Welcome to tyss to";
		   String str[]=s.split(" ");
		   LinkedHashSet <String> Set=new LinkedHashSet<String>();
		   for (int i=0; i<str.length;i++)
		   {
			  Set.add(str[i]) ;
		   }
			

		
		for(String word: Set)
		{
			System.out.println(word);
		}
		}
	   
	   

	}
