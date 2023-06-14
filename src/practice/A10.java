package practice;

import java.util.ArrayList;

public class A10 
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(7);
		a.add(11);
		
		int sum=0;
		for(Object o:a)
		{
			int temp=(Integer)o;
			sum=sum+temp;
		}
          System.out.println("The sum is:"+sum);
	}

}
