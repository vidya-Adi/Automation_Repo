package practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * create an arraylist
 * and add elements to it
 * ask the user to enter an element
 * and then search it
 * if you find it
 * say you are lucky
 * else say not lucky
 */

public class A4 
{

	public static void main(String[] args) 
	{
      ArrayList a = new ArrayList();
      a.add(10);
      a.add(20);
      a.add(30);
      a.add(40);
      
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int key=s.nextInt();
      if(a.contains(key))
      {
    	  System.out.println("ur lucky");10
      }
    	  
    else
    {
    	  System.out.println("ur not lucky");
     }

	}

}
